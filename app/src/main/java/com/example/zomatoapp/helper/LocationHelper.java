package com.example.zomatoapp.helper;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import io.reactivex.disposables.Disposable;
import pl.charmas.android.reactivelocation2.ReactiveLocationProvider;

public class LocationHelper {
    private static final String TAG = LocationHelper.class.getName();

    private static LocationHelper locationHelper;

    private List<OnLocationChangedListener> listeners = new ArrayList<>();

    private Address address;
    private Location currentLocation = new Location("0.0");

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public Address getAddress() {
        return address;
    }

    public static LocationHelper getInstance() {
        if (locationHelper == null) {
            synchronized (LocationHelper.class) {
                if (locationHelper == null) {
                    locationHelper = new LocationHelper();
                }
            }
        }
        return locationHelper;
    }

    public void getRxLocation(Context context, OnLocationCallback callback) {
        ReactiveLocationProvider locationProvider = new ReactiveLocationProvider(context);
        Disposable subscribe = locationProvider.getLastKnownLocation()
                .subscribe(location -> {
                    currentLocation = location;
                    convertAddress(context, currentLocation.getLatitude(), currentLocation.getLongitude());
                    callback.onLocationCallback(location, address);
                });
    }

    private void convertAddress(Context context, double latitude, double longitude) {
        Geocoder geocoder = new Geocoder(context, Locale.getDefault());

        try {
            List<Address> addresses = geocoder.getFromLocation(latitude, longitude, 1);
            if (!addresses.isEmpty()) {
                this.address = addresses.get(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public interface OnLocationChangedListener {
        void onLocationUpdate(Location location);
    }

    public interface OnLocationCallback {
        void onLocationCallback(Location location, Address address);
    }
}

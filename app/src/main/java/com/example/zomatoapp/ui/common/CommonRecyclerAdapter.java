package com.example.zomatoapp.ui.common;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.LayoutRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public abstract class CommonRecyclerAdapter<VM> extends RecyclerView.Adapter<CommonRecyclerHolder> {
    protected List<VM> data;

    protected ViewDataBinding mBinding;

    public boolean isMultipleViewType() {
        return isMultipleViewType;
    }

    public void setMultipleViewType(boolean multipleViewType) {
        isMultipleViewType = multipleViewType;
    }

    private boolean isMultipleViewType;

    public CommonRecyclerAdapter(List<VM> data) {
        this.data = data;
    }

    @Override
    public CommonRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), getLayoutResId(), parent, false);
        return new CommonRecyclerHolder(mBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(CommonRecyclerHolder holder, final int position) {
        mBinding.setVariable(com.example.zomatoapp.BR.viewModel, data.get(position));
        mBinding.executePendingBindings();
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return data != null ? data.size() : 0;
    }

    public void setData(List<VM> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public void addData(List<VM> data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    public List<VM> getData() {
        return data;
    }

    protected abstract @LayoutRes int getLayoutResId();
}

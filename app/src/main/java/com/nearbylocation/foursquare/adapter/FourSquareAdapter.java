package com.nearbylocation.foursquare.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.nearbylocation.BR;
import com.nearbylocation.R;
import com.nearbylocation.repository.remote.model.foursquare.Venue;
import java.util.List;

/**
 * Created by shayan on 9/28/17.
 */

public class FourSquareAdapter extends RecyclerView.Adapter<FourSquareAdapter.ViewHolder> {

    private List<Venue> data;

    class ViewHolder extends RecyclerView.ViewHolder {
        private final ViewDataBinding binding;

        ViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        void bind(Object venue) {
            binding.setVariable(BR.venue, venue);
            binding.executePendingBindings();
        }
    }

    public FourSquareAdapter(List<Venue> data) {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.row_four_square, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Venue venues = data.get(position);
        holder.bind(venues);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
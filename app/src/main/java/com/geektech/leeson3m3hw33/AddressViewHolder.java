package com.geektech.leeson3m3hw33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressViewHolder extends RecyclerView.ViewHolder {
    private TextView addresses;
    public AddressViewHolder(@NonNull View itemView) {
        super(itemView);
        addresses = itemView.findViewById(R.id.addresses);
    }

    public void bind(String addressesValue){
        addresses.setText(addressesValue);
    }
}

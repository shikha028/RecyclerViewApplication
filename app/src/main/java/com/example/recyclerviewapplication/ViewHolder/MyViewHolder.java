package com.example.recyclerviewapplication.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewapplication.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
   public TextView cellText;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        cellText=itemView.findViewById(R.id.cell_text);

    }
}

package com.example.mad314_1896136_pa2;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
   public TextView tvname,tvid;
    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        tvname = itemView.findViewById(R.id.tvName);
        tvid = itemView.findViewById(R.id.tvId);
    }
}

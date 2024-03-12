package com.hasan.exam.Controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hasan.exam.ListModel;
import com.hasan.exam.R;

import java.util.ArrayList;

public class Controller extends RecyclerView.Adapter<Controller.Viewholder> {
    Context context;
    ArrayList<ListModel> datalist;

    public Controller(Context context, ArrayList<ListModel> datalist) {
        this.context = context;
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public Controller.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.recyclerviewcard, parent, false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Controller.Viewholder holder, int position) {
        holder.title.setText(datalist.get(position).getTitle());
        holder.description.setText(datalist.get(position).getDescp());
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {
        TextView title, description;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
        }
    }
}

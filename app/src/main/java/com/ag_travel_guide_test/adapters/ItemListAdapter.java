package com.ag_travel_guide_test.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ag_travel_guide_test.R;
import com.ag_travel_guide_test.models.Mountain;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Mountain> listMountain;

    public ItemListAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Mountain> getListMountain() {
        return listMountain;
    }

    public void setListMountain(ArrayList<Mountain> listMountain) {
        this.listMountain = listMountain;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ListViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        holder.tvName.setText(getListMountain().get(position).getName());
        holder.tvElevation.setText(getListMountain().get(position).getElevation());

        Glide.with(context).load(getListMountain().get(position).getPhoto()).into(holder.imgList);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, getListMountain().get(position).getName() + " clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListMountain().size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvElevation;
        ImageView imgList;
        RelativeLayout relativeLayout;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name_list);
            tvElevation = itemView.findViewById(R.id.tv_elevation_list);
            imgList = itemView.findViewById(R.id.img_list);
            relativeLayout = itemView.findViewById(R.id.relative_layout);
        }
    }
}

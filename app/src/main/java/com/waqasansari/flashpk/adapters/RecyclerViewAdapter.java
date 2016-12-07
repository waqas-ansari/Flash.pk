package com.waqasansari.flashpk.adapters;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.waqasansari.flashpk.R;
import com.waqasansari.flashpk.model.ItemObjects;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by WaqasAhmed on 12/1/2016.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int HEADER = 1;
    private static final int ITEM = 2;

    private List<ItemObjects> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ItemObjects> itemList) {
        this.itemList = itemList;
        this.context = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == HEADER) {
            View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.header, null);
            return new SolventHeader(layoutView);
        } else {
            View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_layout, null);
            return new SolventViewHolders(layoutView);
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof SolventViewHolders) {
            ((SolventViewHolders)holder).oldPrice.setPaintFlags(((SolventViewHolders)holder).oldPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            //holder.countryName.setText(itemList.get(position).getName());
            ((SolventViewHolders)holder).countryPhoto.setImageResource(itemList.get(position-1).getPhoto());
        } else if(holder instanceof SolventHeader) {
            StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setFullSpan(true);
            holder.itemView.setLayoutParams(layoutParams);
        }

    }

    private boolean isPositionHeader(int position) {
        return position == 0;
    }

    @Override
    public int getItemViewType(int position) {
        if (isPositionHeader(position))
            return HEADER;

        return ITEM;
    }



    @Override
    public int getItemCount() {
        return this.itemList.size() + 1;
    }

    class SolventViewHolders extends RecyclerView.ViewHolder {

        TextView oldPrice;
        TextView countryName;
        ImageView countryPhoto;

        SolventViewHolders(View itemView) {
            super(itemView);
            //itemView.setOnClickListener(this);
            oldPrice = (TextView) itemView.findViewById(R.id.oldPrice);
            //countryName = (TextView) itemView.findViewById(R.id.country_name);
            countryPhoto = (ImageView) itemView.findViewById(R.id.country_photo);
        }

        /*
        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Clicked Position = " + getPosition(), Toast.LENGTH_SHORT).show();
        }
        */
    }

    class SolventHeader extends RecyclerView.ViewHolder {

        SolventHeader(View itemView) {
            super(itemView);
        }
    }
}

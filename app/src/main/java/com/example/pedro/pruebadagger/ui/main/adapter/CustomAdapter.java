package com.example.pedro.pruebadagger.ui.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pedro.pruebadagger.R;
import com.example.pedro.pruebadagger.domain.model.Avengers;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by pedro on 15/03/16.
 */
public class CustomAdapter extends BaseAdapter{

    private Context context;
    private List<Avengers> avengersList;

    public CustomAdapter(Context context, List<Avengers> avengersList){
        this.context = context;
        this.avengersList = avengersList;
    }

    @Override
    public int getCount() {
        return avengersList.size();
    }

    @Override
    public Object getItem(int position) {
        return avengersList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;

        if (row == null){
            row = LayoutInflater.from(context).inflate(R.layout.lv_item_inflate_main, null, false);
            holder = new ViewHolder();
            holder.tv_character = (TextView) row.findViewById(R.id.tv_character_description);
            holder.tv_name = (TextView) row.findViewById(R.id.tv_name_description);
            holder.iv_image = (ImageView) row.findViewById(R.id.iv_image);
            holder.tv_active = (TextView) row.findViewById(R.id.tv_active);
            row.setTag(holder);
        }
        else{
            holder = (ViewHolder) row.getTag();
        }

        final Avengers avenger = avengersList.get(position);

        holder.tv_character.setText(avenger.getHeroe());
        holder.tv_name.setText(avenger.getName());
        Picasso.with(context).load(avenger.getImage()).into(holder.iv_image);
        holder.tv_active.setText("Active: " + avenger.isActive());

        return row;
    }

    static class ViewHolder {
        TextView tv_character;
        TextView tv_name;
        ImageView iv_image;
        TextView tv_active;
    }
}

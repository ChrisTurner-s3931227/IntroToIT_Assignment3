package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String beach_list[];
    int beach_images[];
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String[] beach_list, int[] beach_images) {
        this.context = ctx;
        this.beach_list = beach_list;
        this.beach_images = beach_images;
        inflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return beach_list.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView textView = convertView.findViewById(R.id.textView);
        ImageView beachImg = convertView.findViewById(R.id.imageIcon);
        textView.setText(beach_list[position]);
        beachImg.setImageResource(beach_images[position]);
        return convertView;
    }
}

package com.example.delhiguide;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ItemAdaptor extends ArrayAdapter<item> {

    private int colorresourceid;
    public ItemAdaptor(Activity context, ArrayList<item> words, int background){

        super(context,0,words);
        colorresourceid=background;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View ListItemview= convertView;
        if(ListItemview==null)
        {
            ListItemview = LayoutInflater.from(getContext()).inflate(R.layout.single_item_layout, parent, false);
        }

        item currentword = getItem(position);
        String name =currentword.getMname();
        TextView textView1 = (TextView)ListItemview.findViewById(R.id.name);
        textView1.setText(name);

        String Location =currentword.getmLocation();
        TextView textView2 = (TextView)ListItemview.findViewById(R.id.Location);
        textView2.setText(Location);


        String openinghrs =currentword.getMopening_hours();
        TextView textView3 = (TextView)ListItemview.findViewById(R.id.openinghours);
        textView3.setText(openinghrs);

        int imageid= currentword.getMimageresourseid();
        ImageView imageView1=(ImageView)ListItemview.findViewById(R.id.Image);
        if(imageid!=-1)
        {
            imageView1.setImageResource(imageid);

        }
        else
        {
            imageView1.setVisibility(View.GONE);
        }
        int color = ContextCompat.getColor(getContext(),colorresourceid);
        ListItemview.setBackgroundColor(color);
        return ListItemview;

    }
}

package com.example.delhiguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class restaurants extends Fragment {


    public restaurants() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<item> words = new ArrayList<item>();
        words.add(new item("Work in the clouds", "C-11 Block C Connaught Place Connaught Place,","9AM-11PM"));
        words.add(new item("Delhi 32", "Maharaja Surajmal Road The Leela Ambience Convention Hotel, Vivek Vihar","9AM-12PM"));
        words.add(new item("Spring","Radisson Blu, Plot 4 Dwarka City Centre, Sector 13, Dwarka,","9AM-11PM"));
        words.add(new item("Thyme", "Lobby Level Samalkha The Umrao Hotel,","9AM-11PM"));
        words.add(new item("Neung Roi","National Highway 8","9AM-11PM"));
        words.add(new item("Delhi Barbeque", "IGI Airport Road, N.H-08","9AM-11PM"));
        words.add(new item("The great Kabab Factory ","Lobby Level Radisson Blu Plaza National Highway 8","9AM-12PM"));
        words.add(new item("AnnaMaaya","Aerocity, Asset No. 1, New Delhi","9AM-11PM"));
        words.add(new item("The Hong Kong Club","Northern Access Road Asset No. 1","9AM-11PM"));
        words.add(new item("Juniper Bar","Aerocity 1 Asset No, New Delhi","9AM-12PM"));


        final ListView listView=(ListView)rootview.findViewById(R.id.list);
        final ItemAdaptor itemAdaptor = new ItemAdaptor(getActivity(),words,R.color.restaurants_bg);
        listView.setAdapter(itemAdaptor);

        return  rootview;
    }

}

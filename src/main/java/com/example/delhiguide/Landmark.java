package com.example.delhiguide;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Landmark extends Fragment {


    public Landmark() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<item> words = new ArrayList<item>();
        words.add(new item("Connaught-Place","Rajiv Chowk, New Delh","9AM-9PM",R.drawable.landmark_connaught_place));
        words.add(new item("CyberHub","Gurugram","9AM-9PM",R.drawable.landmark_cyberhub));
        words.add(new item("Damdama Lake","Gurgaon (Delhi-NCR)","9AM-9PM",R.drawable.landmark_damdama_lake_3));
        words.add(new item("Delhi- haat","INA-Delhi","9AM-9PM",R.drawable.landmark_delhi_haat));
        words.add(new item("Fun-n-Food-village","Dwarka, New Delhi","9AM-9PM",R.drawable.landmark_funnfood_village));
        words.add(new item("Hauz Khas village","Hauz Khas","9AM-9PM",R.drawable.landmark_hauz_khas_village));
        words.add(new item("Kingdom Of Dreams","IFFCO Chowk, Gurugram","9AM-9PM",R.drawable.landmark_kingdom_of_dreams));
        words.add(new item("National rail museum","Dhaula Kuan, New Delhi","9AM-9PM",R.drawable.landmark_national_rail_museum));
        words.add(new item("Snow world","Sec-18, Noida(Delhi-NCR)","9AM-9PM",R.drawable.landmark_snow_world));
        words.add(new item("worlds Of Wonder","Sector-18, Noida (Delhi-NCR)","9AM-9PM", R.drawable.landmark_worlds_of_wonder));


        final ListView listView=(ListView)rootview.findViewById(R.id.list);
        final ItemAdaptor itemAdaptor = new ItemAdaptor(getActivity(),words,R.color.Landmark_bg);
        listView.setAdapter(itemAdaptor);

        return  rootview;
    }

}

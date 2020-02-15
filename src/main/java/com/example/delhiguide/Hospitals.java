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
public class Hospitals extends Fragment {


    public Hospitals() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

            // Inflate the layout for this fragment
            View rootview = inflater.inflate(R.layout.item_list, container, false);

            //prepare an array list for the items or information of type word
            final ArrayList<item> words = new ArrayList<item>();
            words.add(new item("The Medicity","Delhi","open 24 hrs"));
            words.add(new item("Manipal Hospital","Delhi","open 24 hrs"));
            words.add(new item("Jaipur golden Hospital","Delhi","open 24 hrs"));
            words.add(new item("KK hospital","Delhi","open 24 hrs"));
            words.add(new item("Kalra hospital","Delhi","open 24 hrs"));
            words.add(new item("Fortis escort heart hospital","Delhi","open 24 hrs"));
            words.add(new item("AIIMS","Delhi","open 24 hrs"));
            words.add(new item("Bhagwan Mahavir hospital","Delhi","open 24 hrs"));
            words.add(new item("sri ganga ram hospital","Delhi","open 24 hrs"));
            words.add(new item("Indraprastha Apollo Hospitals","Delhi","open 24 hrs"));
            words.add(new item("Safdarjung Hospital","Delhi","open 24 hrs"));

            final ListView listView=(ListView)rootview.findViewById(R.id.list);
            final ItemAdaptor itemAdaptor = new ItemAdaptor(getActivity(),words,R.color.hospitals_bg);
            listView.setAdapter(itemAdaptor);

            return  rootview;
        }
}




package com.example.delhiguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Monuments extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.item_list, container, false);

    final ArrayList<item> words = new ArrayList<item>();
        words.add(new item("Akshardham Temple","Delhi","9AM-9PM",R.drawable.monuments_akshardhamtemple));
        words.add(new item("Bangla Sahib","Delhi","9AM-9PM",R.drawable.monuments_banglasahib));
        words.add(new item("Humanyus Tomb","Delhi","9AM-9PM",R.drawable.monuments_humayunstomb));
        words.add(new item("India Gate","Delhi","9AM-9PM",R.drawable.monuments_indiagate));
        words.add(new item("Jama Masjid","Delhi","9AM-9PM",R.drawable.monuments_jamamasjid));
        words.add(new item("Jantar Mantar","Delhi","9AM-9PM",R.drawable.monuments_jantarmantar));
        words.add(new item("Laxminarayan Temple","Delhi","9AM-9PM",R.drawable.monuments_laxminarayantemple));
        words.add(new item("Lotus Temple","Delhi","9AM-9PM",R.drawable.monuments_lotustemple));
        words.add(new item("Qutub Minar","Delhi","9AM-9PM",R.drawable.monuments_qutubminar));
        words.add(new item("Rashtrapati bhawan","Delhi","9AM-9PM", R.drawable.monuments_rashtrapatibhavan));
        words.add(new item("Red Fort","Delhi","9AM-9PM",R.drawable.monuments_redfort));

        final ListView listView=(ListView)rootview.findViewById(R.id.list);
        final ItemAdaptor itemAdaptor = new ItemAdaptor(getActivity(),words,R.color.monumentbg);
        listView.setAdapter(itemAdaptor);

    return  rootview;
    }

}

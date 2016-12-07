package com.waqasansari.flashpk.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.waqasansari.flashpk.R;
import com.waqasansari.flashpk.activities.Main;
import com.waqasansari.flashpk.adapters.RecyclerViewAdapter;
import com.waqasansari.flashpk.model.ItemObjects;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Trousers extends Fragment {
    private StaggeredGridLayoutManager staggeredGridLayoutManager;


    public Trousers() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trousers, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        List<ItemObjects> gaggeredList = getListItemData();

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(getContext(), gaggeredList);
        recyclerView.setAdapter(rcAdapter);

        return view;
    }



    private List<ItemObjects> getListItemData(){
        List<ItemObjects> listViewItems = new ArrayList<>();
        listViewItems.add(new ItemObjects("Five Pockets Pants - Steel grey", R.drawable.one));
        listViewItems.add(new ItemObjects("Regular Fit Camouflage - Stone Camo", R.drawable.two));
        listViewItems.add(new ItemObjects("Skin Fit Chino Pants - Stone", R.drawable.three));
        listViewItems.add(new ItemObjects("Skin Fit Chino Pants - Brown", R.drawable.four));
        listViewItems.add(new ItemObjects("Five Pockets Pants - Steel grey", R.drawable.one));
        listViewItems.add(new ItemObjects("Regular Fit Camouflage - Stone Camo", R.drawable.two));
        listViewItems.add(new ItemObjects("Skin Fit Chino Pants - Stone", R.drawable.three));
        listViewItems.add(new ItemObjects("Skin Fit Chino Pants - Brown", R.drawable.four));
        listViewItems.add(new ItemObjects("Five Pockets Pants - Steel grey", R.drawable.one));
        listViewItems.add(new ItemObjects("Regular Fit Camouflage - Stone Camo", R.drawable.two));
        listViewItems.add(new ItemObjects("Skin Fit Chino Pants - Stone", R.drawable.three));
        listViewItems.add(new ItemObjects("Skin Fit Chino Pants - Brown", R.drawable.four));
        return listViewItems;
    }


}

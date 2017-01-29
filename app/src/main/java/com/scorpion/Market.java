package com.scorpion;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Market extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
        expListView = (ExpandableListView) findViewById(R.id.expview);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Livestock");
        listDataHeader.add("Feed");
        listDataHeader.add("Goods");

        List<String> Livestock = new ArrayList<String>();
        Livestock.add("Cattles");
        Livestock.add("Donkeys");
        Livestock.add("Equine");

        List<String> Feed = new ArrayList<String>();
        Feed.add("Grain");
        Feed.add("Hay");
        Feed.add("Haylage");

        List<String> Goods =new ArrayList<String>();
        Goods.add("Attachments");
        Goods.add("Heavy Equipment");
        Goods.add("Tractors");

        listDataChild.put(listDataHeader.get(0), Livestock);
        listDataChild.put(listDataHeader.get(1),Feed);
        listDataChild.put(listDataHeader.get(2),Goods);

    }
}

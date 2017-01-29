package com.scorpion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

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
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                final String selected = (String) listAdapter.getChild(
                        groupPosition, childPosition);
                Toast.makeText(getBaseContext(), selected, Toast.LENGTH_LONG)
                        .show();
                setContentView(R.layout.activity_maps);
                return true;
            }
        });
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

package com.example.expandablelist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;
    String color;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //closes lists onClick
        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
        @Override
        public void onGroupCollapse(int groupPosition) {
            //Toast.makeText(getApplicationContext(),
            //expandableListTitle.get(groupPosition) + " List Collapsed.",
            //Toast.LENGTH_SHORT).show();
        }
    });

    //opens lists onClick
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
        @Override
        public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id){
                Toast.makeText(
                        getApplicationContext(),
                        expandableListTitle.get(groupPosition) + " -> " +
                                expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition),
                        Toast.LENGTH_SHORT).show();

            if (expandableListTitle.get(groupPosition).toLowerCase().equals("colors")) {
                color = expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition);
                Toast.makeText(getApplicationContext(), color + " was chosen.", Toast.LENGTH_SHORT).show();
            }

            if (expandableListTitle.get(groupPosition).toLowerCase().equals("types")) {
                type = expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition);
                Toast.makeText(getApplicationContext(), type + " was chosen.", Toast.LENGTH_SHORT).show();
            }
            return true;
        }
    });
}
}


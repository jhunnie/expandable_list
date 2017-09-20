package com.example.expandablelist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jenniferhu on 9/20/17.
 */

public class ExpandableListItems {
    public static HashMap<String, List<String>> getData(){
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Green");
        colors.add("Gray");
        colors.add("Gold");
        colors.add("Orange");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Red");
        colors.add("Silver");
        colors.add("White");
        colors.add("Yellow");

        List<String> types = new ArrayList<String>();
        types.add("Accessories");
        types.add("Bottoms");
        types.add("Dresses");
        types.add("Jackets");
        types.add("Jumpsuits");
        types.add("Shoes");
        types.add("Tops");

        expandableListDetail.put("Colors", colors);
        expandableListDetail.put("Types", types);
        return expandableListDetail;
    }
}


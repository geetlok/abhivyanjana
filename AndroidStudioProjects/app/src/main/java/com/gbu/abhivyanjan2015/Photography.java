package com.gbu.abhivyanjan2015;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by shubham on 2/4/2015.
 */
public class Photography extends ListActivity {
    String details[]={"ShutterCusine","Selfiesh"};
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,details));
    }
    protected void onListItemClick(ListView lv,View v,int position,long id){
        super.onListItemClick(lv,v,position,id);
        String openDetails= details[position];
        try{
            Class selected = Class.forName("com.gbu.abhivyanjan2015."+openDetails);
            Intent selectedIntent=new Intent(this,selected);
            startActivity(selectedIntent);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

package com.gbu.abhivyanjan2015;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by shubham on 2/4/2015.
 */
public class Adventure extends ListActivity {
    String details[]={"ScavengerHunt","PleasureTreasure","PaintGrenade"};
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
            Toast help=Toast.makeText(Adventure.this,"click on screen to proceed", Toast.LENGTH_LONG);
            help.show();
        }
    }
}


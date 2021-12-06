package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Maininfo> petList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.InitializePetData();

        ListView my_listview = (ListView)findViewById(R.id.my_listview);
        final PetListAdapter petListAdapter = new PetListAdapter(this, petList);

        my_listview.setAdapter(petListAdapter);


    }

    public void InitializePetData(){
        petList = new ArrayList<Maininfo>();
        petList.add(new Maininfo("0429", "aru", 8, "pome"));
        petList.add(new Maininfo("0323", "Ddunge", 7, "poodle"));
    }
}
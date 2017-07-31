package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;

public class HospitalActivity extends AppCompatActivity {

    private Firebase myRef;
    private String value;
    private ListView listView;
    private ArrayList<TourItems> list = new ArrayList<>();
    private TourAdapter adapter;
    private ImageView imgResturant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant);
        MainActivity.CHECK_ACTIVITY ="HospitalActivity";

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView = (ListView) findViewById(R.id.listViews);

        adapter = new TourAdapter(this,list);
        listView.setAdapter(adapter);
        myRef = new Firebase("https://myapplication-e1a0b.firebaseio.com/");

        myRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                TourItems  value = dataSnapshot.getValue(TourItems.class);
                adapter.add(value);
                listView.setAdapter(adapter);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


    }
}

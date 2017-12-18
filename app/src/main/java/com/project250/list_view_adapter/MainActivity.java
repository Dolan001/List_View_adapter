package com.project250.list_view_adapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Car> cars;
    RecyclerView listView;

    ImageView imageView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        database = mFirebaseDatabase.getReference().child("Cars");

        listView = (RecyclerView) findViewById(R.id.recyclerView);
        cars = new ArrayList<Car>();
        //listView.setAdapter(new CarAdapter(cars, this));

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                cars = new ArrayList<Car>();
                for (DataSnapshot x : dataSnapshot.getChildren()) {
                    Car car = x.getValue(Car.class);
                    cars.add(car);
                }

                Toast.makeText(getApplicationContext(), String.valueOf(cars.size()), Toast.LENGTH_SHORT).show();
                listView.setAdapter(new CarAdapter(cars, MainActivity.this));

                //adapter = new CarAdapter(cars, MainActivity.this);
                // listView.setAdapter(adapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}

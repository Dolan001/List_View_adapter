package com.project250.list_view_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
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

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                cars = new ArrayList<Car>();
                for (DataSnapshot x : dataSnapshot.getChildren()) {
                    Car car = x.getValue(Car.class);
                    cars.add(car);
                }
                listView.setAdapter(new CarAdapter(cars, MainActivity.this));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}

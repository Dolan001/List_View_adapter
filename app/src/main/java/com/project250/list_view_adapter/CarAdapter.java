package com.project250.list_view_adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.myViewHolder> {
    ArrayList<Car> carList;
    Activity activity;
    private LayoutInflater inflater;

    public CarAdapter(ArrayList<Car> carList, Activity activity) {
        this.carList = carList;
        this.activity = activity;
        Toast.makeText(activity, "Eshita + " + String.valueOf(carList.size()), Toast.LENGTH_LONG).show();

        for(int i=0; i<this.carList.size(); i++) {
            Toast.makeText(this.activity, carList.get(i).getCarname(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.student_layout, null);
        myViewHolder holder = new myViewHolder(view);

        Toast.makeText(activity, "Eshita +=+ " + String.valueOf(carList.size()), Toast.LENGTH_LONG).show();
        return holder;
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        Car car = carList.get(position);
        holder.carname.setText(car.getCarname());
        Toast.makeText(activity, "Eshita - " + car.getCarname(), Toast.LENGTH_LONG).show();

        holder.price.setText(car.getPriceperday());
        holder.carlocation.setText(car.getCarlocation());
        holder.date.setText(car.getDate());
        holder.time.setText(car.getTime());

    }

    @Override
    public int getItemCount() {
        Toast.makeText(activity, "Eshita * " + String.valueOf(carList.size()), Toast.LENGTH_LONG).show();
        return carList.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder {
        TextView carname, info1, info2, info3, info4, info5, passenger, seats, price, carlocation, date, time;

        public myViewHolder(View itemView) {
            super(itemView);
            carname = (TextView) itemView.findViewById(R.id.car1name);
            price = (TextView) itemView.findViewById(R.id.priceperday);
            carlocation = (TextView) itemView.findViewById(R.id.carlocation);
            date = (TextView) itemView.findViewById(R.id.date);
            time = (TextView) itemView.findViewById(R.id.time);
        }
    }
}


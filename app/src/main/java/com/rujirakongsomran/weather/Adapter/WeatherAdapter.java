package com.rujirakongsomran.weather.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rujirakongsomran.weather.Model.Weather;
import com.rujirakongsomran.weather.R;

import java.util.ArrayList;
import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherViewHolder> {
    Context context;
    ArrayList<Weather> weatherList;

    public WeatherAdapter(Context context, ArrayList<Weather> weatherList) {
        this.context = context;
        this.weatherList = weatherList;
    }

    @NonNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherViewHolder holder, int position) {
        holder.tvStationName.setText(weatherList.get(position).getStationNameEng());
        holder.tvTemperatureValue.setText(String.valueOf(weatherList.get(position).getTemperatureValue()));
    }

    @Override
    public int getItemCount() {
        return weatherList.size();
    }
}

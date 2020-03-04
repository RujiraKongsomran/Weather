package com.rujirakongsomran.weather.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rujirakongsomran.weather.R;

public class WeatherViewHolder extends RecyclerView.ViewHolder {
    TextView tvStationName, tvTemperatureValue;

    public WeatherViewHolder(@NonNull View itemView) {
        super(itemView);

        tvStationName = (TextView) itemView.findViewById(R.id.tvStationName);
        tvTemperatureValue = (TextView) itemView.findViewById(R.id.tvTemperatureValue);

    }
}

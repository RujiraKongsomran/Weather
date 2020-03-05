package com.rujirakongsomran.weather.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rujirakongsomran.weather.R;


public class WeatherViewHolder extends RecyclerView.ViewHolder {
    TextView tvDateValue;
    TextView tvStationNameTh;
    TextView tvStationNameEng;
    TextView tvTemperatureValue, tvTemperatureUnit;
    TextView tvRelativeHumidityValue, tvRelativeHumidityUnit;
    TextView tvWindSpeedValue, tvWindSpeedUnit;
    TextView tvRainfallValue, tvRainfallUnit;


    public WeatherViewHolder(@NonNull View itemView) {
        super(itemView);
        tvDateValue = (TextView) itemView.findViewById(R.id.tvDateValue);
        tvStationNameTh = (TextView) itemView.findViewById(R.id.tvStationNameTh);
        tvStationNameEng = (TextView) itemView.findViewById(R.id.tvStationNameEng);

        tvTemperatureValue = (TextView) itemView.findViewById(R.id.tvTemperatureValue);
        tvTemperatureUnit = (TextView) itemView.findViewById(R.id.tvTemperatureUnit);

        tvRelativeHumidityValue = (TextView) itemView.findViewById(R.id.tvRelativeHumidityValue);
        tvRelativeHumidityUnit = (TextView) itemView.findViewById(R.id.tvRelativeHumidityUnit);

        tvWindSpeedValue = (TextView) itemView.findViewById(R.id.tvWindSpeedValue);
        tvWindSpeedUnit = (TextView) itemView.findViewById(R.id.tvWindSpeedUnit);

        tvRainfallValue = (TextView) itemView.findViewById(R.id.tvRainfallValue);
        tvRainfallUnit = (TextView) itemView.findViewById(R.id.tvRainfallUnit);
    }
}

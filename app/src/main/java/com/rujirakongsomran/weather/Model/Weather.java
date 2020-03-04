package com.rujirakongsomran.weather.Model;

public class Weather {
    private String stationNameEng;
    private double temperatureValue;

    public Weather() {
    }

    public Weather(String stationNameEng, double temperatureValue) {
        this.stationNameEng = stationNameEng;
        this.temperatureValue = temperatureValue;
    }

    public String getStationNameEng() {
        return stationNameEng;
    }

    public void setStationNameEng(String stationNameEng) {
        this.stationNameEng = stationNameEng;
    }

    public double getTemperatureValue() {
        return temperatureValue;
    }

    public void setTemperatureValue(double temperatureValue) {
        this.temperatureValue = temperatureValue;
    }
}

package com.rujirakongsomran.weather.Model;

public class Weather {
    private String time;
    private String stationNameTh;
    private String stationNameEng;
    private double temperatureValue;
    private String temperatureUnit;
    private int relativeHumidityValue;
    private String relativeHumidityUnit;
    private int windSpeedValue;
    private String windSpeedValueUnit;
    private double rainfallValue;
    private String rainfallUnit;


    public Weather() {
    }

    public Weather(String time, String stationNameTh, String stationNameEng, double temperatureValue, String temperatureUnit, int relativeHumidityValue, String relativeHumidityUnit, int windSpeedValue, String windSpeedValueUnit, double rainfallValue, String rainfallUnit) {
        this.time = time;
        this.stationNameTh = stationNameTh;
        this.stationNameEng = stationNameEng;
        this.temperatureValue = temperatureValue;
        this.temperatureUnit = temperatureUnit;
        this.relativeHumidityValue = relativeHumidityValue;
        this.relativeHumidityUnit = relativeHumidityUnit;
        this.windSpeedValue = windSpeedValue;
        this.windSpeedValueUnit = windSpeedValueUnit;
        this.rainfallValue = rainfallValue;
        this.rainfallUnit = rainfallUnit;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStationNameTh() {
        return stationNameTh;
    }

    public void setStationNameTh(String stationNameTh) {
        this.stationNameTh = stationNameTh;
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

    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    public int getRelativeHumidityValue() {
        return relativeHumidityValue;
    }

    public void setRelativeHumidityValue(int relativeHumidityValue) {
        this.relativeHumidityValue = relativeHumidityValue;
    }

    public String getRelativeHumidityUnit() {
        return relativeHumidityUnit;
    }

    public void setRelativeHumidityUnit(String relativeHumidityUnit) {
        this.relativeHumidityUnit = relativeHumidityUnit;
    }

    public int getWindSpeedValue() {
        return windSpeedValue;
    }

    public void setWindSpeedValue(int windSpeedValue) {
        this.windSpeedValue = windSpeedValue;
    }

    public String getWindSpeedValueUnit() {
        return windSpeedValueUnit;
    }

    public void setWindSpeedValueUnit(String windSpeedValueUnit) {
        this.windSpeedValueUnit = windSpeedValueUnit;
    }

    public double getRainfallValue() {
        return rainfallValue;
    }

    public void setRainfallValue(double rainfallValue) {
        this.rainfallValue = rainfallValue;
    }

    public String getRainfallUnit() {
        return rainfallUnit;
    }

    public void setRainfallUnit(String rainfallUnit) {
        this.rainfallUnit = rainfallUnit;
    }
}

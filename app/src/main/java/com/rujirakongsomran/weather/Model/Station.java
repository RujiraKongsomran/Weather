package com.rujirakongsomran.weather.Model;

public class Station {
    private String WmoNumber;
    private String StationNameTh;
    private String StationNameEng;
    private String Province;
    private Latitude Latitude;
    private Longitude Longitude;
    private Observe Observe;

    public Station() {
    }

    public Station(String wmoNumber, String stationNameTh, String stationNameEng, String province, com.rujirakongsomran.weather.Model.Latitude latitude, com.rujirakongsomran.weather.Model.Longitude longitude, com.rujirakongsomran.weather.Model.Observe observe) {
        WmoNumber = wmoNumber;
        StationNameTh = stationNameTh;
        StationNameEng = stationNameEng;
        Province = province;
        Latitude = latitude;
        Longitude = longitude;
        Observe = observe;
    }

    public String getWmoNumber() {
        return WmoNumber;
    }

    public void setWmoNumber(String wmoNumber) {
        WmoNumber = wmoNumber;
    }

    public String getStationNameTh() {
        return StationNameTh;
    }

    public void setStationNameTh(String stationNameTh) {
        StationNameTh = stationNameTh;
    }

    public String getStationNameEng() {
        return StationNameEng;
    }

    public void setStationNameEng(String stationNameEng) {
        StationNameEng = stationNameEng;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public com.rujirakongsomran.weather.Model.Latitude getLatitude() {
        return Latitude;
    }

    public void setLatitude(com.rujirakongsomran.weather.Model.Latitude latitude) {
        Latitude = latitude;
    }

    public com.rujirakongsomran.weather.Model.Longitude getLongitude() {
        return Longitude;
    }

    public void setLongitude(com.rujirakongsomran.weather.Model.Longitude longitude) {
        Longitude = longitude;
    }

    public com.rujirakongsomran.weather.Model.Observe getObserve() {
        return Observe;
    }

    public void setObserve(com.rujirakongsomran.weather.Model.Observe observe) {
        Observe = observe;
    }
}

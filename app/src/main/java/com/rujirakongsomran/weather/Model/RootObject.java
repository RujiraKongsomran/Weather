package com.rujirakongsomran.weather.Model;

import java.util.List;

public class RootObject {
    private Header Header;
    private List<Station> Stations;

    public RootObject() {
    }

    public RootObject(com.rujirakongsomran.weather.Model.Header header, List<Station> stations) {
        Header = header;
        Stations = stations;
    }

    public com.rujirakongsomran.weather.Model.Header getHeader() {
        return Header;
    }

    public void setHeader(com.rujirakongsomran.weather.Model.Header header) {
        Header = header;
    }

    public List<Station> getStations() {
        return Stations;
    }

    public void setStations(List<Station> stations) {
        Stations = stations;
    }
}

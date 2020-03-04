package com.rujirakongsomran.weather.Model;

public class WindDirection {
    private String Value;
    private String Unit;

    public WindDirection() {
    }

    public WindDirection(String value, String unit) {
        Value = value;
        Unit = unit;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }
}

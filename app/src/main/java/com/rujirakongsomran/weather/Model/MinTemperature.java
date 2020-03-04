package com.rujirakongsomran.weather.Model;

public class MinTemperature {
    private double Value;
    private String Unit;

    public MinTemperature() {
    }

    public MinTemperature(double value, String unit) {
        Value = value;
        Unit = unit;
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }
}

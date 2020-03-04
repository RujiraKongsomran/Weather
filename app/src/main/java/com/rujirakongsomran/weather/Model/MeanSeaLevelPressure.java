package com.rujirakongsomran.weather.Model;

public class MeanSeaLevelPressure {
    private double Value;
    private String Unit;

    public MeanSeaLevelPressure() {
    }

    public MeanSeaLevelPressure(double value, String unit) {
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

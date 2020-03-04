package com.rujirakongsomran.weather.Model;

public class Observe {
    private String Time;
    private MeanSeaLevelPressure MeanSeaLevelPressure;
    private Temperature Temperature;
    private MaxTemperature MaxTemperature;
    private DiffMaxTemperature DiffMaxTemperature;
    private MinTemperature MinTemperature;
    private DiffMinTemperature DiffMinTemperature;
    private RelativeHumidity RelativeHumidity;
    private WindDirection WindDirection;
    private WindSpeed WindSpeed;
    private Rainfall Rainfall;

    public Observe() {
    }

    public Observe(String time, com.rujirakongsomran.weather.Model.MeanSeaLevelPressure meanSeaLevelPressure, com.rujirakongsomran.weather.Model.Temperature temperature, com.rujirakongsomran.weather.Model.MaxTemperature maxTemperature, com.rujirakongsomran.weather.Model.DiffMaxTemperature diffMaxTemperature, com.rujirakongsomran.weather.Model.MinTemperature minTemperature, com.rujirakongsomran.weather.Model.DiffMinTemperature diffMinTemperature, com.rujirakongsomran.weather.Model.RelativeHumidity relativeHumidity, com.rujirakongsomran.weather.Model.WindDirection windDirection, com.rujirakongsomran.weather.Model.WindSpeed windSpeed, com.rujirakongsomran.weather.Model.Rainfall rainfall) {
        Time = time;
        MeanSeaLevelPressure = meanSeaLevelPressure;
        Temperature = temperature;
        MaxTemperature = maxTemperature;
        DiffMaxTemperature = diffMaxTemperature;
        MinTemperature = minTemperature;
        DiffMinTemperature = diffMinTemperature;
        RelativeHumidity = relativeHumidity;
        WindDirection = windDirection;
        WindSpeed = windSpeed;
        Rainfall = rainfall;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public com.rujirakongsomran.weather.Model.MeanSeaLevelPressure getMeanSeaLevelPressure() {
        return MeanSeaLevelPressure;
    }

    public void setMeanSeaLevelPressure(com.rujirakongsomran.weather.Model.MeanSeaLevelPressure meanSeaLevelPressure) {
        MeanSeaLevelPressure = meanSeaLevelPressure;
    }

    public com.rujirakongsomran.weather.Model.Temperature getTemperature() {
        return Temperature;
    }

    public void setTemperature(com.rujirakongsomran.weather.Model.Temperature temperature) {
        Temperature = temperature;
    }

    public com.rujirakongsomran.weather.Model.MaxTemperature getMaxTemperature() {
        return MaxTemperature;
    }

    public void setMaxTemperature(com.rujirakongsomran.weather.Model.MaxTemperature maxTemperature) {
        MaxTemperature = maxTemperature;
    }

    public com.rujirakongsomran.weather.Model.DiffMaxTemperature getDiffMaxTemperature() {
        return DiffMaxTemperature;
    }

    public void setDiffMaxTemperature(com.rujirakongsomran.weather.Model.DiffMaxTemperature diffMaxTemperature) {
        DiffMaxTemperature = diffMaxTemperature;
    }

    public com.rujirakongsomran.weather.Model.MinTemperature getMinTemperature() {
        return MinTemperature;
    }

    public void setMinTemperature(com.rujirakongsomran.weather.Model.MinTemperature minTemperature) {
        MinTemperature = minTemperature;
    }

    public com.rujirakongsomran.weather.Model.DiffMinTemperature getDiffMinTemperature() {
        return DiffMinTemperature;
    }

    public void setDiffMinTemperature(com.rujirakongsomran.weather.Model.DiffMinTemperature diffMinTemperature) {
        DiffMinTemperature = diffMinTemperature;
    }

    public com.rujirakongsomran.weather.Model.RelativeHumidity getRelativeHumidity() {
        return RelativeHumidity;
    }

    public void setRelativeHumidity(com.rujirakongsomran.weather.Model.RelativeHumidity relativeHumidity) {
        RelativeHumidity = relativeHumidity;
    }

    public com.rujirakongsomran.weather.Model.WindDirection getWindDirection() {
        return WindDirection;
    }

    public void setWindDirection(com.rujirakongsomran.weather.Model.WindDirection windDirection) {
        WindDirection = windDirection;
    }

    public com.rujirakongsomran.weather.Model.WindSpeed getWindSpeed() {
        return WindSpeed;
    }

    public void setWindSpeed(com.rujirakongsomran.weather.Model.WindSpeed windSpeed) {
        WindSpeed = windSpeed;
    }

    public com.rujirakongsomran.weather.Model.Rainfall getRainfall() {
        return Rainfall;
    }

    public void setRainfall(com.rujirakongsomran.weather.Model.Rainfall rainfall) {
        Rainfall = rainfall;
    }
}

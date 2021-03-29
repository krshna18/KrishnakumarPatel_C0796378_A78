package com.krishna;

public class Temperature {

    private String name;
    private String dayOfWeek;
    private double tempOfDay;
    private double windSpeed;
    private double feelsLikeTemp;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = "Krishna";
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public double getTempOfDay() {
        return tempOfDay;
    }

    public void setTempOfDay(double tempOfDay) {
        this.tempOfDay = tempOfDay;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getFeelsLikeTemp() {
        return feelsLikeTemp;
    }

    public void setFeelsLikeTemp(double feelsLikeTemp) {
        this.feelsLikeTemp = feelsLikeTemp;
    }

    // method to calculate the feels like temperature
    ///can also use get methods instead of passing parameters
    public double temperature(double temp, double speed) {
        this.tempOfDay = temp;
        this.windSpeed = speed;
        feelsLikeTemp = tempOfDay * windSpeed;
        return feelsLikeTemp;
    }
}

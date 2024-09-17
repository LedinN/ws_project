package com.nick.ws_project.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherData {

    private String time;
    private WeatherValues values;

    // Constructors
    public WeatherData() {}

    public WeatherData(String time, WeatherValues values) {
        this.time = time;
        this.values = values;
    }

    // Getters and Setters
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public WeatherValues getValues() {
        return values;
    }

    public void setValues(WeatherValues values) {
        this.values = values;
    }
}

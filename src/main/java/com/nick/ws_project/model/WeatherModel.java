package com.nick.ws_project.model;

import java.util.List;

public class WeatherModel {

    private int count;
    private List<Data> data;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}

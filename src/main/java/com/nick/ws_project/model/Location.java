package com.nick.ws_project.model;

public class Location {

        private Double lat;
        private Double lon;
        private String name;
        private String type;

        // Constructors
        public Location() {}

        public Location(Double lat, Double lon, String name, String type) {
            this.lat = lat;
            this.lon = lon;
            this.name = name;
            this.type = type;
        }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

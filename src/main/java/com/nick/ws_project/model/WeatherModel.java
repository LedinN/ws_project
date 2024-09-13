package com.nick.ws_project.model;

import java.util.List;

public class WeatherModel {

    private int count;
    private double app_temp;
    private int aqi;
    private String city_name;
    private int clouds;
    private String country_code;
    private String datetime;
    private double dewpt;
    private double dhi;
    private double dni;
    private double elev_angle;
    private double ghi;
    private Double gust;
    private int h_angle;
    private double lat;
    private double lon;
    private String ob_time;
    private String pod;
    private double precip;
    private double pres;
    private int rh;
    private double slp;
    private double snow;
    private double solar_rad;
    private List<String> sources;
    private String state_code;
    private String station;
    private String sunrise;
    private String sunset;
    private double temp;
    private String timezone;
    private long ts;
    private int uv;
    private double vis;
    private String wind_cdir;
    private String wind_cdir_full;
    private int wind_dir;
    private double wind_spd;
    private String weather_description;
    private int weather_code;
    private String weather_icon;

    public int getAqi() {
        return aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getApp_temp() {
        return app_temp;
    }

    public void setApp_temp(double app_temp) {
        this.app_temp = app_temp;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public double getDewpt() {
        return dewpt;
    }

    public void setDewpt(double dewpt) {
        this.dewpt = dewpt;
    }

    public double getDhi() {
        return dhi;
    }

    public void setDhi(double dhi) {
        this.dhi = dhi;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public double getElev_angle() {
        return elev_angle;
    }

    public void setElev_angle(double elev_angle) {
        this.elev_angle = elev_angle;
    }

    public double getGhi() {
        return ghi;
    }

    public void setGhi(double ghi) {
        this.ghi = ghi;
    }

    public Double getGust() {
        return gust;
    }

    public void setGust(Double gust) {
        this.gust = gust;
    }

    public int getH_angle() {
        return h_angle;
    }

    public void setH_angle(int h_angle) {
        this.h_angle = h_angle;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getOb_time() {
        return ob_time;
    }

    public void setOb_time(String ob_time) {
        this.ob_time = ob_time;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public double getPrecip() {
        return precip;
    }

    public void setPrecip(double precip) {
        this.precip = precip;
    }

    public double getPres() {
        return pres;
    }

    public void setPres(double pres) {
        this.pres = pres;
    }

    public int getRh() {
        return rh;
    }

    public void setRh(int rh) {
        this.rh = rh;
    }

    public double getSlp() {
        return slp;
    }

    public void setSlp(double slp) {
        this.slp = slp;
    }

    public double getSnow() {
        return snow;
    }

    public void setSnow(double snow) {
        this.snow = snow;
    }

    public double getSolar_rad() {
        return solar_rad;
    }

    public void setSolar_rad(double solar_rad) {
        this.solar_rad = solar_rad;
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public String getState_code() {
        return state_code;
    }

    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public double getVis() {
        return vis;
    }

    public void setVis(double vis) {
        this.vis = vis;
    }

    public String getWind_cdir() {
        return wind_cdir;
    }

    public void setWind_cdir(String wind_cdir) {
        this.wind_cdir = wind_cdir;
    }

    public String getWind_cdir_full() {
        return wind_cdir_full;
    }

    public void setWind_cdir_full(String wind_cdir_full) {
        this.wind_cdir_full = wind_cdir_full;
    }

    public int getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(int wind_dir) {
        this.wind_dir = wind_dir;
    }

    public double getWind_spd() {
        return wind_spd;
    }

    public void setWind_spd(double wind_spd) {
        this.wind_spd = wind_spd;
    }

    public String getWeather_description() {
        return weather_description;
    }

    public void setWeather_description(String weather_description) {
        this.weather_description = weather_description;
    }

    public int getWeather_code() {
        return weather_code;
    }

    public void setWeather_code(int weather_code) {
        this.weather_code = weather_code;
    }

    public String getWeather_icon() {
        return weather_icon;
    }

    public void setWeather_icon(String weather_icon) {
        this.weather_icon = weather_icon;
    }
}

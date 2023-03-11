package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CoordsResponse {
    Random rand = new Random();
    double lat = rand.nextDouble(90);
    double lon = rand.nextDouble(180);
    double azim = rand.nextDouble(360);
    int speed = rand.nextInt(100);



    public String getCoords() {
        List<Object> coordsList = new ArrayList<>();
        coordsList.add(lat);
        coordsList.add(lon);
        coordsList.add(azim);
        coordsList.add(speed);
        return coordsList.toString();
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

    public double getAzim() {
        return azim;
    }

    public void setAzim(double azim) {
        this.azim = azim;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

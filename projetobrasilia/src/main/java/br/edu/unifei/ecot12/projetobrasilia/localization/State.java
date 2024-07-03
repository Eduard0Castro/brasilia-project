package br.edu.unifei.ecot12.projetobrasilia.localization;

import java.util.ArrayList;
import java.util.List;

public class State extends Locality{
    private String region;
    private float area;
    private List<City> cities = new ArrayList<>();

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    
}

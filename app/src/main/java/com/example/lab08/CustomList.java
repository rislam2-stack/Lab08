package com.example.lab08;

import java.util.ArrayList;

public class CustomList {

    private ArrayList<City> cities;

    public CustomList() {
        cities = new ArrayList<>();
    }

    public int getCount() {
        return cities.size();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public void deleteCity(City city) {
        cities.remove(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }
}
package com.driver;

public class Movie {
    private String name;
    private int durationInMinutes;
    private double imdbRating;

    public Movie(String name, int durationInMinutes, double imbRating) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.imdbRating = imbRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getImbRating() {
        return imdbRating;
    }

    public void setImbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}

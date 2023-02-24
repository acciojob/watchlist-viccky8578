package com.driver;

public class Movie {
    private String name;
    private String durationInMinutes;
    private double imdbRating;

    public Movie(String name, String durationInMinutes, double imbRating) {
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

    public String getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(String durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getImbRating() {
        return imdbRating;
    }

    public void setImbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}

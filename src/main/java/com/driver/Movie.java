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

    public String getDurationInMinute() {
        return durationInMinutes;
    }

    public void setDurationInMinute(String durationInMinute) {
        this.durationInMinutes = durationInMinute;
    }

    public double getImbRating() {
        return imdbRating;
    }

    public void setImbRating(double imbRating) {
        this.imdbRating = imbRating;
    }
}

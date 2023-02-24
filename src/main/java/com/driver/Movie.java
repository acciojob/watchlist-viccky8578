package com.driver;

public class Movie {
    private String name;
    private String durationInMinute;
    private double imbRating;

    public Movie(String name, String durationInMinute, double imbRating) {
        this.name = name;
        this.durationInMinute = durationInMinute;
        this.imbRating = imbRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDurationInMinute() {
        return durationInMinute;
    }

    public void setDurationInMinute(String durationInMinute) {
        this.durationInMinute = durationInMinute;
    }

    public double getImbRating() {
        return imbRating;
    }

    public void setImbRating(double imbRating) {
        this.imbRating = imbRating;
    }
}

package com.driver;

public class Director {
    private String name;
    private int numberOfMovie;
    private double imbRating;

    public Director(String name, int numberOfMovie, double imbRating) {
        this.name = name;
        this.numberOfMovie = numberOfMovie;
        this.imbRating = imbRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMovie() {
        return numberOfMovie;
    }

    public void setNumberOfMovie(int numberOfMovie) {
        this.numberOfMovie = numberOfMovie;
    }

    public double getImbRating() {
        return imbRating;
    }

    public void setImbRating(double imbRating) {
        this.imbRating = imbRating;
    }
}

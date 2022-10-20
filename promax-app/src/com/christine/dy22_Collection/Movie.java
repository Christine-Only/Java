package com.christine.dy22_Collection;

public class Movie {
    private String movieName;
    private String date;
    private String director;

    public Movie(String movieName, String date, String director) {
        this.movieName = movieName;
        this.date = date;
        this.director = director;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", date='" + date + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}

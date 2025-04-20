package ru.netology.qa.manager;

import ru.netology.qa.domain.Movie;

public class MoviesManager {

    private Movie[] movie = new Movie[0];
    private int limit = 5;

    public MoviesManager() {
    }

    public MoviesManager(int limit) {
        if (limit > 0) {
            this.limit = limit;
        }
    }

    public void AddMovie(Movie newMovie) {
        Movie[] tmp = new Movie[movie.length + 1];
        for (int i = 0; i < movie.length; i++) {
            tmp[i] = movie[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movie = tmp;
    }

    public Movie[] findAll() {
        return movie;
    }

    public Movie[] findLast() {
        int resultLength;
        if (limit < movie.length) {
            resultLength = limit;
        } else {
            resultLength = movie.length;
        }
        Movie[] reversed = new Movie[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movie[reversed.length - 1 - i];
        }
        return reversed;
    }
}

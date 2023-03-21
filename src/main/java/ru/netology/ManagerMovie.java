package ru.netology;

public class ManagerMovie {
    private MoviesList[] films = new MoviesList[0];
    int limit;
    public ManagerMovie() {
        this.limit = 5;
    }
    public ManagerMovie(int limit) {
        this.limit = limit;
    }

    public void addFilm(MoviesList film) {
        MoviesList[] tmp = new MoviesList[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public MoviesList[] findAll() {
        return films;
    }
    public MoviesList[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        MoviesList[] reversed = new MoviesList[resultLength];
        for(int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }

    }


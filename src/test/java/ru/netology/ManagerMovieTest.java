package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerMovieTest {
    MoviesList film1 =  new MoviesList("Бладшот");
    MoviesList film2 =  new MoviesList("Вперед");
    MoviesList film3 =  new MoviesList("Отель 'Белград'");
    MoviesList film4 =  new MoviesList("Джентльмены");

    MoviesList film5 =  new MoviesList("Человек-невидимка");
    MoviesList film6 =  new MoviesList("Тролли. Мировой тур");



    @Test
    public void shouldAddMovie() {
        ManagerMovie films = new ManagerMovie();
        films.addFilm(film1);

        MoviesList[] expected = {film1};
        MoviesList[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddMovies() {
        ManagerMovie films = new ManagerMovie();
        films.addFilm(film1);
        films.addFilm(film2);
        films.addFilm(film3);
        films.addFilm(film4);
        films.addFilm(film5);

        MoviesList[] expected = {film1, film2, film3, film4, film5};
        MoviesList[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        ManagerMovie films = new ManagerMovie();
        films.addFilm(film1);
        films.addFilm(film2);
        films.addFilm(film3);
        films.addFilm(film4);

        MoviesList[] expected = {film4, film3, film2, film1};
        MoviesList[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }
    @Test
    public void shouldFindLastIfMoreDefaultLimit() {
        ManagerMovie films = new ManagerMovie();
        films.addFilm(film1);
        films.addFilm(film2);
        films.addFilm(film3);
        films.addFilm(film4);
        films.addFilm(film5);
        films.addFilm(film6);

        MoviesList[] expected = {film6, film5, film4, film3, film2};
        MoviesList[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastIfMoreLimitSet() {
        ManagerMovie films = new ManagerMovie(3);
        films.addFilm(film1);
        films.addFilm(film2);
        films.addFilm(film3);
        films.addFilm(film4);
        films.addFilm(film5);
        films.addFilm(film6);

        MoviesList[] expected = {film6, film5, film4};
        MoviesList[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastIfLimitSet() {
        ManagerMovie films = new ManagerMovie(3);
        films.addFilm(film1);
        films.addFilm(film2);
        films.addFilm(film3);


        MoviesList[] expected = {film3, film2, film1};
        MoviesList[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.qa.domain.Movie;
import ru.netology.qa.manager.MoviesManager;

class MoviesManagerTest {
    MoviesManager manager = new MoviesManager();
    Movie movie1 = new Movie(1, "Восемь с половиной", 1963);
    Movie movie2 = new Movie(2, "Гражданин Кейн", 1941);
    Movie movie3 = new Movie(3, "Крёстный отец", 1972);
    Movie movie4 = new Movie(4, "Белая лента", 2009);
    Movie movie5 = new Movie(5, "2001 год: Космическая одиссея", 1968);
    Movie movie6 = new Movie(6, "Нефть", 2007);
    Movie movie7 = new Movie(7, "Четыреста ударов", 1959);
    Movie movie8 = new Movie(8, "Токийская повесть", 1953);
    Movie movie9 = new Movie(9, "Зеркало", 1974);
    Movie movie10 = new Movie(10, "Похитители велосипедов", 1949);


    @Test

    public void shouldMoviesDefaultLimitIfMovies4() {
        manager.AddMovie(movie1);
        manager.AddMovie(movie2);
        manager.AddMovie(movie3);
        manager.AddMovie(movie4);

        Movie[] expectedFindAll = {movie1, movie2, movie3, movie4};
        Movie[] actualFindAll = manager.findAll();

        Movie[] expectedFindLast = {movie4, movie3, movie2, movie1};
        Movie[] actualFindLast = manager.findLast();

        Assertions.assertArrayEquals(expectedFindAll, actualFindAll);
        Assertions.assertArrayEquals(expectedFindLast, actualFindLast);
    }

    @Test

    public void shouldMoviesDefaultLimitIfMovies5() {
        manager.AddMovie(movie1);
        manager.AddMovie(movie2);
        manager.AddMovie(movie3);
        manager.AddMovie(movie4);
        manager.AddMovie(movie5);
        manager.AddMovie(movie6);

        Movie[] expectedFindAll = {movie1, movie2, movie3, movie4, movie5, movie6};
        Movie[] actualFindAll = manager.findAll();

        Movie[] expectedFindLast = {movie5, movie4, movie3, movie2, movie1};
        Movie[] actualFindLast = manager.findLast();

        Assertions.assertArrayEquals(expectedFindAll, actualFindAll);
        Assertions.assertArrayEquals(expectedFindLast, actualFindLast);
    }

    @Test
    public void shouldMoviesDefaultLimitIfMovies6() {
        manager.AddMovie(movie1);
        manager.AddMovie(movie2);
        manager.AddMovie(movie3);
        manager.AddMovie(movie4);
        manager.AddMovie(movie5);
        manager.AddMovie(movie6);

        Movie[] expectedFindAll = {movie1, movie2, movie3, movie4, movie5, movie6};
        Movie[] actualFindAll = manager.findAll();

        Movie[] expectedFindLast = {movie5, movie4, movie3, movie2, movie1};
        Movie[] actualFindLast = manager.findLast();

        Assertions.assertArrayEquals(expectedFindAll, actualFindAll);
        Assertions.assertArrayEquals(expectedFindLast, actualFindLast);
    }

    @Test
    public void shouldMoviesLimitLess0() {
        MoviesManager managerLimit = new MoviesManager(-1);
        managerLimit.AddMovie(movie1);
        managerLimit.AddMovie(movie2);
        managerLimit.AddMovie(movie3);
        managerLimit.AddMovie(movie4);
        managerLimit.AddMovie(movie5);
        managerLimit.AddMovie(movie6);

        Movie[] expectedFindAll = {movie1, movie2, movie3, movie4, movie5, movie6};
        Movie[] actualFindAll = managerLimit.findAll();

        Movie[] expectedFindLast = {movie5, movie4, movie3, movie2, movie1};
        Movie[] actualFindLast = managerLimit.findLast();

        Assertions.assertArrayEquals(expectedFindAll, actualFindAll);
        Assertions.assertArrayEquals(expectedFindLast, actualFindLast);
    }

    @Test
    public void shouldMoviesLimit0() {
        MoviesManager managerLimit = new MoviesManager(0);
        managerLimit.AddMovie(movie1);
        managerLimit.AddMovie(movie2);
        managerLimit.AddMovie(movie3);
        managerLimit.AddMovie(movie4);
        managerLimit.AddMovie(movie5);
        managerLimit.AddMovie(movie6);

        Movie[] expectedFindAll = {movie1, movie2, movie3, movie4, movie5, movie6};
        Movie[] actualFindAll = managerLimit.findAll();

        Movie[] expectedFindLast = {movie5, movie4, movie3, movie2, movie1};
        Movie[] actualFindLast = managerLimit.findLast();

        Assertions.assertArrayEquals(expectedFindAll, actualFindAll);
        Assertions.assertArrayEquals(expectedFindLast, actualFindLast);
    }

    @Test
    public void shouldMoviesLimitLessMovielength() {
        MoviesManager managerLimit = new MoviesManager(4);
        managerLimit.AddMovie(movie1);
        managerLimit.AddMovie(movie2);
        managerLimit.AddMovie(movie3);
        managerLimit.AddMovie(movie4);
        managerLimit.AddMovie(movie5);
        managerLimit.AddMovie(movie6);

        Movie[] expectedFindAll = {movie1, movie2, movie3, movie4, movie5, movie6};
        Movie[] actualFindAll = managerLimit.findAll();

        Movie[] expectedFindLast = {movie4, movie3, movie2, movie1};
        Movie[] actualFindLast = managerLimit.findLast();

        Assertions.assertArrayEquals(expectedFindAll, actualFindAll);
        Assertions.assertArrayEquals(expectedFindLast, actualFindLast);
    }

    @Test
    public void shouldMoviesLimitEqualMovielength() {
        MoviesManager managerLimit = new MoviesManager(5);
        managerLimit.AddMovie(movie1);
        managerLimit.AddMovie(movie2);
        managerLimit.AddMovie(movie3);
        managerLimit.AddMovie(movie4);
        managerLimit.AddMovie(movie5);

        Movie[] expectedFindAll = {movie1, movie2, movie3, movie4, movie5};
        Movie[] actualFindAll = managerLimit.findAll();

        Movie[] expectedFindLast = {movie5, movie4, movie3, movie2, movie1};
        Movie[] actualFindLast = managerLimit.findLast();

        Assertions.assertArrayEquals(expectedFindAll, actualFindAll);
        Assertions.assertArrayEquals(expectedFindLast, actualFindLast);
    }

    @Test
    public void shouldMoviesLimitMoreMovielength() {
        MoviesManager managerLimit = new MoviesManager(6);
        managerLimit.AddMovie(movie1);
        managerLimit.AddMovie(movie2);
        managerLimit.AddMovie(movie3);
        managerLimit.AddMovie(movie4);
        managerLimit.AddMovie(movie5);

        Movie[] expectedFindAll = {movie1, movie2, movie3, movie4, movie5};
        Movie[] actualFindAll = managerLimit.findAll();

        Movie[] expectedFindLast = {movie5, movie4, movie3, movie2, movie1};
        Movie[] actualFindLast = managerLimit.findLast();

        Assertions.assertArrayEquals(expectedFindAll, actualFindAll);
        Assertions.assertArrayEquals(expectedFindLast, actualFindLast);
    }


}

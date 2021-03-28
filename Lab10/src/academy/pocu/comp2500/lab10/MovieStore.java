package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.Movie;
import academy.pocu.comp2500.lab10.pocuflix.NotFoundResult;
import academy.pocu.comp2500.lab10.pocuflix.OkResult;
import academy.pocu.comp2500.lab10.pocuflix.ResultBase;

import java.util.ArrayList;

public final class MovieStore implements IRequestHandler {
    private ArrayList<Movie> movies;
    public MovieStore() {
        movies = new ArrayList<>();
    }
    public ArrayList<Movie> getMovies() {
        return movies;
    }
    public void add(Movie movie) {
        movies.add(movie);
    }
    public boolean remove(int index) {
        if (index + 1 > movies.size()) {
            return false;
        } else {
            movies.remove(index);
            return true;
        }
    }

    @Override
    public ResultBase handle(Request request) {
        for (Movie movie : movies) {
            if (movie.getTitle().equals(request.getTitle())) {
                return new OkResult(movie);
            }
        }
        return new NotFoundResult();
    }
}

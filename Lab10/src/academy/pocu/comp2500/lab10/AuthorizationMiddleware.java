package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.*;

import java.util.HashSet;

public final class AuthorizationMiddleware implements IRequestHandler {
    private MovieStore movieStore;
    private HashSet<User> users;

    public AuthorizationMiddleware(MovieStore movieStore, HashSet<User> users) {
        this.movieStore = movieStore;
        this.users = users;
    }

    @Override
    public ResultBase handle(Request request) {
        if (!users.contains(request.getUser())) {
            return new UnauthorizedResult();
        }
        for (Movie movie : movieStore.getMovies()) {
            if (movie.getTitle() == request.getTitle()) {
                return new OkResult(movie);
            }
        }
        return new NotFoundResult();
    }
}

package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.*;

import java.time.OffsetDateTime;

public final class MaintenanceMiddleware implements IRequestHandler {
    private MovieStore movieStore;
    private OffsetDateTime startTime;

    public MaintenanceMiddleware(MovieStore movieStore, OffsetDateTime startTime) {
        this.movieStore = movieStore;
        this.startTime = startTime;
    }

    @Override
    public ResultBase handle(Request request) {
        if (OffsetDateTime.now().compareTo(startTime) >= 0 && OffsetDateTime.now().compareTo(startTime.plusHours(1)) <= 0) {
            return new ServiceUnavailableResult(startTime, startTime.plusHours(1));
        }
        for (Movie movie : movieStore.getMovies()) {
            if (movie.getTitle() == request.getTitle()) {
                return new OkResult(movie);
            }
        }
        return new NotFoundResult();
    }
}

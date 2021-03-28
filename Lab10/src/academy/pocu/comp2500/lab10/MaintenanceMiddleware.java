package academy.pocu.comp2500.lab10;

import java.time.OffsetDateTime;

public final class MaintenanceMiddleware {
    private MovieStore movieStore;
    private OffsetDateTime time;

    public MaintenanceMiddleware(MovieStore movieStore, OffsetDateTime time) {
        this.movieStore = movieStore;
        this.time = time;
    }
}

package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.Movie;
import academy.pocu.comp2500.lab10.pocuflix.NotFoundResult;
import academy.pocu.comp2500.lab10.pocuflix.OkResult;
import academy.pocu.comp2500.lab10.pocuflix.ResultBase;

import java.time.OffsetDateTime;

public final class MaintenanceMiddleware implements IRequestHandler {
    private IRequestHandler handler;
    private OffsetDateTime startTime;

    public MaintenanceMiddleware(IRequestHandler handler, OffsetDateTime startTime) {
        this.handler = handler;
        this.startTime = startTime;
    }

    @Override
    public ResultBase handle(Request request) {
        OffsetDateTime now = OffsetDateTime.now();
        if (now.isAfter(startTime) && now.isBefore(startTime.plusHours(1))) {
            return new ServiceUnavailableResult(startTime, startTime.plusHours(1));
        }
        return handler.handle(request);
    }
}

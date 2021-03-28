package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.Movie;
import academy.pocu.comp2500.lab10.pocuflix.NotFoundResult;
import academy.pocu.comp2500.lab10.pocuflix.OkResult;
import academy.pocu.comp2500.lab10.pocuflix.ResultBase;

import java.util.HashMap;

public final class CacheMiddleware implements IRequestHandler {
    private MovieStore movieStore;
    private int expiryCount;
    private HashMap<Request, Integer> cache = new HashMap<>();

    public CacheMiddleware(MovieStore movieStore, int expiryCount) {
        this.movieStore = movieStore;
        this.expiryCount = expiryCount;
    }

    @Override
    public ResultBase handle(Request request) {
        if (cache.containsKey(request)) {
            int count = cache.get(request);
            if (count == 1) {
                for (Movie m : movieStore.getMovies()) {
                    if (m.getTitle() == request.getTitle()) {
                        cache.put(request, expiryCount);
                        return new OkResult(m);
                    }
                }
            }
            cache.put(request, count - 1);
            return new CachedResult(cache.get(request));
        }
        for (Movie m : movieStore.getMovies()) {
            if (m.getTitle() == request.getTitle()) {
                cache.put(request, expiryCount);
                return new OkResult(m);
            }
        }
        return new NotFoundResult();
    }
}

package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.*;

import java.util.HashMap;

public final class CacheMiddleware implements IRequestHandler {
    private IRequestHandler handler;
    private int expiryCount;
    private HashMap<Request, Integer> cache = new HashMap<>();

    public CacheMiddleware(IRequestHandler handler, int expiryCount) {
        this.handler = handler;
        this.expiryCount = expiryCount;
    }

    @Override
    public ResultBase handle(Request request) {
        // cache에 없는 Request라면 새로 추가
        if (!cache.containsKey(request)) {
            if (handler.handle(request).getCode() == ResultCode.OK) {
                cache.put(request, 0);
            }
            return handler.handle(request);
        }
        // cache에 있다는 의미로 사용횟수 1 증가
        cache.put(request, cache.get(request) + 1);
        // cache가 expiryCount보다 아직 작다면 남은 횟수를 인자로 갖는 CachedResult 반환
        if (cache.get(request) < expiryCount) {
            return new CachedResult(expiryCount - cache.get(request));
        }
        // expiryCount보다 크거나 같다면 삭제, 새로 다시 추가
        cache.remove(request);
        if (handler.handle(request).getCode() == ResultCode.OK) {
            cache.put(request, 0);
        }
        return handler.handle(request);
    }
}

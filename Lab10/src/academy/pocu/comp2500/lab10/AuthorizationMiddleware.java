package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.ResultBase;
import academy.pocu.comp2500.lab10.pocuflix.User;

import java.util.HashSet;

public final class AuthorizationMiddleware implements IRequestHandler {
    private IRequestHandler handler;
    private HashSet<User> users;

    public AuthorizationMiddleware(IRequestHandler handler, HashSet<User> users) {
        this.handler = handler;
        this.users = users;
    }

    @Override
    public ResultBase handle(Request request) {
        if (!users.contains(request.getUser())) {
            return new UnauthorizedResult();
        }
        return handler.handle(request);
    }
}

package org.example.behavioral.Chain;

public class SessionChainHandler extends AbstractChainHandler {
    private static final String KEY = "session";

    @Override
    public void handle(Request request) {
        if (request.getHeaders().containsKey(KEY))
            request.setSession(request.getHeaders().get(KEY));
    }
}

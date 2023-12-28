package org.example.behavioral.Chain;

public class PathChainHandler extends AbstractChainHandler {
    private static final String KEY = "path";

    @Override
    public void handle(Request request) {
        if (request.getHeaders().containsKey(KEY))
            request.setPath(request.getHeaders().get(KEY));
    }
}

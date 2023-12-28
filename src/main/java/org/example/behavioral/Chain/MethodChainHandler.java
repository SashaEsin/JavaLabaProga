package org.example.behavioral.Chain;


class MethodChainHandler extends AbstractChainHandler {
    private static final String KEY = "method";

    @Override
    void handle(Request request) {
        if (request.getHeaders().containsKey(KEY))
            request.setMethod(request.getHeaders().get(KEY));
    }
}

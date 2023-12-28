package org.example.behavioral.Chain;

public class HeadersChainHandler extends AbstractChainHandler {
    private static final String DELIMITER = ":";

    @Override
    void handle(Request request) {
        String[] headers = request.getInputStream().split("\n");
        for (String header : headers) {
            if (header.isEmpty())
                continue;
            String[] arr = header.split(DELIMITER);
            if (arr.length != 2)
                continue;
            request.getHeaders().put(arr[0], arr[1]);
        }
    }
}

package org.example.behavioral.Chain;

public class Main {
    public static void main(String[] args) {
        ChainService chainService = new ChainService();
        String inputStream = "method:GET\npath:/home\nsession:123\n";

        Request processedRequest = chainService.exec(inputStream);

        System.out.println("Method: " + processedRequest.getMethod());
        System.out.println("Path: " + processedRequest.getPath());
        System.out.println("Session: " + processedRequest.getSession());
        System.out.println("Headers: " + processedRequest.getHeaders());
    }
}

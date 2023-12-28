package org.example.generative.Singleton;

class Application {
    public static void main(String[] args) {
        SingletonService service = new SingletonService();
        service.exec();
    } }
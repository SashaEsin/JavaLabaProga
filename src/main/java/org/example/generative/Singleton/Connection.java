package org.example.generative.Singleton;

public class Connection {
    private static Connection instance;
    private Connection() {}
    // всякие разные методы данного класса
    // .
    // .
    // .
    // конец всяких методов
    public static Connection getInstance() {
        if(null != instance)
            return instance;
        instance = new Connection();
        return instance;
    }
}
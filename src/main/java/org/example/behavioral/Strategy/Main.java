package org.example.behavioral.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляров стратегий
        Strategy commaSeparatedStrategy = new CommaSeparatedStrategy();
        Strategy semicolonSeparatedStrategy = new SemicolonSeparatedStrategy();

        // Создание сервиса стратегий
        StrategyService strategyService = new StrategyServiceImpl(commaSeparatedStrategy);

        // Пример использования
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("world");

        // Выполнение стратегии
        String result = strategyService.exec(strings);
        System.out.println("Result: " + result);

        // Изменение стратегии
        strategyService.setStrategy(semicolonSeparatedStrategy);

        // Выполнение новой стратегии
        result = strategyService.exec(strings);
        System.out.println("Result with semicolon strategy: " + result);
    }
}

package org.example.behavioral.Strategy;
import java.util.List;


public class StrategyServiceImpl implements StrategyService {
    private Strategy strategy;

    public StrategyServiceImpl(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String exec(List<String> strings) {
        if (strings.isEmpty())
            return "";
        return strategy.process(strings);
    }

    public StrategyService setStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }
}
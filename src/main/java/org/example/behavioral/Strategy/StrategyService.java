package org.example.behavioral.Strategy;
import java.util.List;




public interface StrategyService {
    String exec(List<String> strings);
    StrategyService setStrategy(Strategy strategy);
}

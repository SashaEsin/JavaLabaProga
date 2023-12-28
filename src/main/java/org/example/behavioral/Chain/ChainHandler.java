package org.example.behavioral.Chain;




public interface ChainHandler {
    void process(Request request);
    ChainHandler next();
    ChainHandler next(ChainHandler chainHandler);
}

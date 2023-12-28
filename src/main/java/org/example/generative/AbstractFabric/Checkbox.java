package org.example.generative.AbstractFabric;

public interface Checkbox {
    void render();
    Checkbox state(boolean state);
    boolean state();
}
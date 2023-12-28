package org.example.generative.AbstractFabric;

public class WebCheckbox implements Checkbox {
    private boolean state;

    public void render() {
        System.out.println(
                String.format("render WebCheckbox. With state %s", state)
        );
    }
    public boolean state() {
        return state;
    }

    public Checkbox state(boolean state) {
        this.state = state;
        return this;
    }
}

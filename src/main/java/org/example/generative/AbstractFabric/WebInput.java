package org.example.generative.AbstractFabric;

public class WebInput implements Input {
    private String value;

    public Input value(String value) {
        this.value = value;
        return this;
    }

    public String value() {
        return value;
    }

    public void render() {
        System.out.println(
                String.format("render WebInput. With value %s", value)
        );
    }
}
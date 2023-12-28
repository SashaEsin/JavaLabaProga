package org.example.generative.Fabric;

abstract class AbstractDialog implements Dialog {
    // Фабричный метод
    abstract Button createButton();

    public void render() {
        Button button = createButton();
        button.render();
    }
}

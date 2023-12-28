package org.example.generative.AbstractFabric;

public class AbstractFabricService {
    private FormElementFactory initFactory() {
        Configuration configuration = Configuration.initWeb();
        FormElementFactory factory;
        switch (configuration.getPlatform()) {
            case Configuration.WEB:
                factory = new WebFormElementFactory();
                break;
            case Configuration.MOB:
                factory = new MobFormElementFactory();
                break;
            default:
                throw new IllegalArgumentException("Неизвестный тип платформы");
        }
        return factory;
    }

    private void renderForm(FormElementFactory factory) {
        Input input = factory.createInput();
        Button button = factory.createButton();
        input.value("Тестовое значение поля ввода данных");
        input.render();
        button.render();
    }

    public void exec() {
        renderForm(initFactory());
    }
}
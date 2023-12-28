package org.example.generative.Fabric;

public class FabricMethodService {
    public void exec() {
        Configuration configuration = Configuration.initWeb();

        Dialog dialog;
        switch (configuration.getPlatform()) {
            case Configuration.WEB:
                dialog = new WebDialog();
                break;
            case Configuration.MOB:
                dialog = new MobDialog();
                break;
            default:
                throw new IllegalArgumentException("Неизвестный тип платформы");
        }
        dialog.render();
    }
}

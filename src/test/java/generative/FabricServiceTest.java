package generative;

import org.example.generative.AbstractFabric.AbstractFabricService;
import org.example.generative.AbstractFabric.Button;
import org.example.generative.Fabric.Configuration;
import org.example.generative.Fabric.FabricMethodService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class FabricServiceTest {

    @Test
    public void test() throws Exception {
        FabricMethodService service = new FabricMethodService();
        service.exec();
    }

    @Test
    public void jUnitTest() {
        Configuration web = Configuration.initWeb();
        assertEquals(Configuration.WEB, web.getPlatform());

        Configuration mob = Configuration.initMob();
        assertEquals(Configuration.MOB, mob.getPlatform());
    }
}

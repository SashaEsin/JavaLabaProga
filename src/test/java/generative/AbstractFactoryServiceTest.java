package generative;

import org.example.generative.AbstractFabric.AbstractFabricService;
import org.example.generative.Fabric.Configuration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractFactoryServiceTest {

    @Test
    public void test() throws Exception {
        AbstractFabricService service = new AbstractFabricService();
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

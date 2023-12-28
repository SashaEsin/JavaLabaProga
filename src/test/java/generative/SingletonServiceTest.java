package generative;

import org.example.generative.Singleton.Connection;
import org.example.generative.Singleton.SingletonService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonServiceTest {

    @Test
    public void test() {
        SingletonService service = new SingletonService();
        service.exec();
    }

    @Test
    public void jUnitTest() {
        Connection connection = Connection.getInstance();
        Connection connection1 = Connection.getInstance();

        assertSame(connection1, connection);
    }
}

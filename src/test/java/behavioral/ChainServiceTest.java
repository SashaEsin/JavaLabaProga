package behavioral;

import org.example.behavioral.Chain.ChainService;
import org.example.behavioral.Chain.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ChainServiceTest {

    @Test
    public void test() {
        String inputStream = "method:GET\npath:/user/info\nsession:hfhfhf-dhdhdhdhf-ayeye76";
        ChainService service = new ChainService();
        Request request = service.exec(inputStream);

        System.out.println("method " + request.getMethod());
        System.out.println("path " + request.getPath());
        System.out.println("session " + request.getSession());

        assertEquals("GET", request.getMethod());
        assertEquals("/user/info", request.getPath());
        assertEquals("hfhfhf-dhdhdhdhf-ayeye76", request.getSession());
    }

    @Test
    public void requestTest() {
        final String testString = "test";

        Request request = new Request();
        assertEquals(request, request.setInputStream(testString));
        assertEquals(request, request.setMethod(testString));
        assertEquals(request, request.setPath(testString));
        assertEquals(request, request.setSession(testString));
        assertEquals(testString, request.getInputStream());
        assertEquals(testString, request.getMethod());
        assertEquals(testString, request.getPath());
        assertEquals(testString, request.getSession());
    }
}

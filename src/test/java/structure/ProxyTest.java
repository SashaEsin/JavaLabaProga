package structure;

import org.example.structure.Proxy.CacheProxyYouTubeApiClient;
import org.example.structure.Proxy.ProxyService;
import org.example.structure.Proxy.Video;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProxyTest {

    @Test
    public void test() {
        ProxyService service = new ProxyService();
        service.exec();
    }

    @Test
    public void serviceTest() {
        CacheProxyYouTubeApiClient apiClient = new CacheProxyYouTubeApiClient();
        Map<String, Video> map = apiClient.popularVideos();

        assertEquals(apiClient.popularVideos(), map);
    }

    @Test
    public void videoTest() {
        CacheProxyYouTubeApiClient apiClient = new CacheProxyYouTubeApiClient();
        Video video = apiClient.getVideo("sadgahasgdas");

        assertEquals(apiClient.getVideo("sadgahasgdas"), video);
    }
}

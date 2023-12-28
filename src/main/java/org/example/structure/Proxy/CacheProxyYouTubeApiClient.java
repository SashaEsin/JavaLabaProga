package org.example.structure.Proxy;

import java.util.HashMap;
import java.util.Map;
public class CacheProxyYouTubeApiClient implements YouTubeApiClient {
    private YouTubeApiClient youtubeService;
    private Map<String, Video> cachePopular = new HashMap<>();
    private Map<String, Video> cacheAll = new HashMap<>();

    public CacheProxyYouTubeApiClient() {
        this.youtubeService = new ThirdPartyYouTubeApiClient();
    }

    public Map<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    public Video getVideo(String videoId) {
        if (!cacheAll.containsKey(videoId)) {
            Video video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return cacheAll.get(videoId);
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}

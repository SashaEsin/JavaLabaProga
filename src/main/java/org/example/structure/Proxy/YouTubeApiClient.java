package org.example.structure.Proxy;

import java.util.Map;

interface YouTubeApiClient {
    Map<String, Video> popularVideos();
    Video getVideo(String videoId);
}
package org.example.structure.Proxy;

public class ProxyService {
    public void exec() {
        YouTubeVideoDownloader nativeDownloader = new YouTubeVideoDownloader(new ThirdPartyYouTubeApiClient());
        YouTubeVideoDownloader smartDownloader = new YouTubeVideoDownloader(new CacheProxyYouTubeApiClient());
        call(nativeDownloader);
        call(smartDownloader);
    }

    private void call(YouTubeVideoDownloader downloader) {
        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");
    }
}
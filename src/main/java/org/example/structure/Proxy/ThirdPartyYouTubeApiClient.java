package org.example.structure.Proxy;

import java.util.HashMap;
import java.util.Map;
class ThirdPartyYouTubeApiClient implements YouTubeApiClient {
    public Map<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    // Fake methods to simulate network activity. They are as slow as a real life.
    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        // Simulating connection time
        try {
            Thread.sleep(random(1000, 3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Connected!");
    }

    private Map<String, Video> getRandomVideos() {
        System.out.print("Downloading populars... ");
        HashMap<String, Video> hmap = new HashMap<>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programming lesson#1.avi"));
        System.out.println("Done!");
        return hmap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video... ");
        // Simulating video download time
        try {
            Thread.sleep(random(2000, 4000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Video video = new Video(videoId, "Some video title");
        System.out.println("Done!");
        return video;
    }
}

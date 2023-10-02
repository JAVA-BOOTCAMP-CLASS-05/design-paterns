package estructural.proxy;

import java.util.HashMap;

public interface YouTubeLibraryDeTerceros {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);

}

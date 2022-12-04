package videos;

public class VideoFactory {//视频工厂

    public void getVideo(String BVID){
        Video video=new Video(BVID);
        video.getVideo();
    }
}

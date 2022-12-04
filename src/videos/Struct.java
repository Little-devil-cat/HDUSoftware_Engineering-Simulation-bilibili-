package videos;

public class Struct {//视频数据
    public String video;
    public String recommend;
    public String comment;

    @Override
    public String toString() {
        return  video + '\n' +
                "评论区：" + comment + '\n' +
                "推荐视频：" + recommend ;
    }

}

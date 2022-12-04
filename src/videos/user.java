package videos;

import java.util.Scanner;

public class user {//用户数据
    String ID;
    String name;
    int level;
    public user(String ID,String name,int level){
        this.ID=ID;
        this.name=name;
        this.level=level;
    }
    public String getUserId() {
        return ID;
    }
    public String getUsername() {
        return name;
    }
    public void setUsername(String name) {
        this.name = name;
    }
    public void createVideo(String BVID){
        VideoFactory vd=new VideoFactory();
        vd.getVideo(BVID);
        Only only=new Only();
        if (!(only.onlyOne())){
            return;
        }
    }
}

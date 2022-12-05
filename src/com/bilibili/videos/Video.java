package com.bilibili.videos;

public class Video extends VideoFactory implements VideoI{//视频类
    String BVID;
    String name;
    String author;
    Struct data=new Struct();
    public Video(String BVID){
        this.BVID=BVID;
        if(BVID.equals("00001")){
            name="1号视频";
            author="1号up";
            data.recommend="1类推荐视频";
            data.comment="友好评论区";
            data.video="欢快的视频";
        }
        else if(BVID.equals("00002")){
            name="2号视频";
            author="2号up";
            data.recommend="2类推荐视频";
            data.comment="引战评论区";
            data.video="引战的视频";
        }
    }
    public void getVideo(){
        System.out.println("开始播放："+BVID);
        System.out.println("视频名："+name);
        System.out.println("作者是："+author);
        System.out.println("视频："+data);
        if(BVID.equals("00001")){
            interaction();
            System.out.println("评论区更新："+data.comment);
        }
        System.out.println("\n");
    }

    @Override
    public void recommend() {
        System.out.println("推荐视频："+data.recommend);
    }

    @Override
    public void interaction() {
        data.comment+="，用户评论";
    }
}

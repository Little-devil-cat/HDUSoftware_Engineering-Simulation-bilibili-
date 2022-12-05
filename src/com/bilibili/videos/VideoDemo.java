package com.bilibili.videos;

public class VideoDemo {
    public static void main(String[] args){
        user user0=new user("001","00a",5);
        user user1=new user("002","00b",4);
        System.out.println(user0.name+"观看视频");
        user0.createVideo("00001");
        System.out.println(""+user1.name+"观看视频");
        user1.createVideo("00002");
    }
}

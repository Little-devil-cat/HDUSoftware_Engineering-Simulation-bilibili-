package com.bilibili.space;

import com.bilibili.space.Observer;

public class BilibiliUser extends Observer {
    public BilibiliUser(String name,VedioSpace v1,WordSpace p1) {
        this.name=name;
        this.subWord1=p1;
        //this.subWord2=p2;
        this.subVedio1=v1;
        //this.subVedio2=v2;
    }
    @Override
    public void update() {
        System.out.printf("%s 已获得动态Word的信息:%s%n",name,subWord1.getNews());
        //System.out.printf("%s 已获得朋友圈Photo2的信息:%s%n",name,subWord2.getNews());
        System.out.printf("%s 已获得动态Vedio的信息:%s%n",name,subVedio1.getNews());
        //System.out.printf("%s 已获得朋友圈Vedio2的信息:%s%n",name,subVedio2.getNews());
    }
}
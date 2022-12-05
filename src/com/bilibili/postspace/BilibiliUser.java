package com.bilibili.postspace;



public class BilibiliUser extends Observer {
    public BilibiliUser(String name,PictureSpace v1,WordSpace p1) {
        this.name=name;
        this.subWord1=p1;

        this.subPicture1=v1;

    }
    @Override
    public void update() {
        System.out.printf("%s 已获得评论区Word1的信息:%s%n",name,subWord1.getNews());

        System.out.printf("%s 已获得评论区Picture1的信息:%s%n",name,subPicture1.getNews());

        System.out.printf("%s 评论区现有信息:%s,%s%n",name,subPicture1.getNews(),subWord1.getNews());

    }
}
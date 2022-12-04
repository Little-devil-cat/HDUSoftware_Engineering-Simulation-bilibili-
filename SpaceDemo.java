package com.bilibili.space;
import java.util.*;
public class SpaceDemo {
    public static void main(String[] args){
        AbstractSpace a=SpaceProducer.getSpace("VedioSpace");
        VedioSpace b=a.getVedioSpace("Vedio2");
        AbstractSpace d=SpaceProducer.getSpace("WordSpace");
        WordSpace c=d.getWordSpace("Word2");
        //b.publish("dasdas");
        Observer user1=new BilibiliUser("bilibili",b,c);
        user1.update();
    }
}
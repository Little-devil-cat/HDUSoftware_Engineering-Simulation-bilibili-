package com.bilibili.space;
import java.util.*;
public class ShowTougao extends space{

    String[] Tougaolist ={"投稿1","投稿2","投稿3","投稿4","投稿5"};
    @Override
    public ShowTougao settg(int jurisdiction){
        System.out.println("投稿列表");
        if (jurisdiction == 1) {
            Arrays.asList(Tougaolist).stream().forEach(s -> System.out.println(s));
        }
        else {
            System.out.println("无权查看");
        }
        return null;
    }
    @Override
    public ShowShoucang setsc(int jurisdiction){
        return null;
    }
    public void update(){}
}

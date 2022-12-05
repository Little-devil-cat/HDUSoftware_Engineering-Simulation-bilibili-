package com.bilibili.space;
import java.util.*;
public class ShowShoucang extends space{
    String[] Shoucanglist ={"收藏1","收藏2","收藏3","收藏4","收藏5"};
    @Override
    public ShowShoucang setsc(int jurisdiction) {
        System.out.println("收藏列表");
        if (jurisdiction == 1) {
            Arrays.asList(Shoucanglist).stream().forEach(s -> System.out.println(s));
        }
        else {
            System.out.println("无权查看");
        }
        return null;
    }
    @Override
    public ShowTougao settg(int jurisdiction){
        return null;
    }

    public void update(){}
}

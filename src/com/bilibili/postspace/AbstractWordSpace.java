package com.bilibili.postspace;

public class AbstractWordSpace extends AbstractSpace{
    @Override
    public PictureSpace getPictureSpace(String name) {
        ///
        return null;
    }
    @Override
    public WordSpace getWordSpace(String name) {
        System.out.println("B发表文字评论");
        if(name.equalsIgnoreCase("Word1")) {
            System.out.println("Word1发表成功");
            return new Word1();
        }else if(name.equalsIgnoreCase("Word2")) {
            System.out.println("Word2 发表成功");
            return new Word2();
        }
        else {
            System.out.println("No true Picture");
            return null;
        }

    }
}
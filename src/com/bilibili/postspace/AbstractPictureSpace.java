package com.bilibili.postspace;

public class AbstractPictureSpace extends AbstractSpace{
    @Override
    public PictureSpace getPictureSpace(String name) {
        System.out.println("A发表图片评论");
        if(name.equalsIgnoreCase("Picture1")) {
            System.out.println("Picture one 发表成功");
            return new Picture1();
        }else if(name.equalsIgnoreCase("Picture2")) {
            System.out.println("Picture two 发表成功");
            return new Picture2();
        }
        else {
            System.out.println("No true Picture");
            return null;
        }
    }

    @Override
    public WordSpace getWordSpace(String name) {
        //
        return null;
    }
}
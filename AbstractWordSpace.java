package com.bilibili.space;

public class AbstractWordSpace extends AbstractSpace{
    @Override
    public VedioSpace getVedioSpace(String name) {
        ///
        return null;
    }
    @Override
    public WordSpace getWordSpace(String name) {
        System.out.println("This is B");
        if(name.equalsIgnoreCase("Word1")) {
            System.out.println("Word1 发表成功");
            return new Word1();
        }else if(name.equalsIgnoreCase("Word2")) {
            System.out.println("Word2 发表成功");
            return new Word2();
        }
        else {
            System.out.println("No true Vedio");
            return null;
        }

    }
}
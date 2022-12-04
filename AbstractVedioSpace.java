package com.bilibili.space;

public class AbstractVedioSpace extends AbstractSpace{
    @Override
    public VedioSpace getVedioSpace(String name) {
        System.out.println("This is A");
        if(name.equalsIgnoreCase("Vedio1")) {
            System.out.println("Vedio1 发表成功");
            return new Vedio1();
        }else if(name.equalsIgnoreCase("Vedio2")) {
            System.out.println("Vedio2 发表成功");
            return new Vedio2();
        }
        else {
            System.out.println("No true Vedio");
            return null;
        }
    }

    @Override
    public WordSpace getWordSpace(String name) {
        //
        return null;
    }
}
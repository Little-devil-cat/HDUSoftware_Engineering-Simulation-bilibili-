package com.bilibili.postspace;

public abstract class Observer {
    public PictureSpace subPicture1;
    public WordSpace subWord1;
    public String name;

    abstract public void update();
}

package com.bilibili.space;

public abstract class Observer {
    public VedioSpace subVedio1;
    public WordSpace subWord1;
    public String name;

    abstract public void update();
}

package com.bilibili.space;

public abstract class space {

    public Dongtai dongtai;
    public Shoucang shoucang;
    public Tougao tougao;
    public Zhuifan zhuifan;

    public abstract ShowShoucang setsc(int jurisdiction);

    public abstract ShowTougao settg(int jurisdiction);

    public String id;
    public int uid;
    abstract public void update();
}

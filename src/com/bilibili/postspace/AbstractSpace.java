package com.bilibili.postspace;

public abstract class AbstractSpace {
    public abstract PictureSpace getPictureSpace(String name);
    public abstract WordSpace getWordSpace(String name);
}
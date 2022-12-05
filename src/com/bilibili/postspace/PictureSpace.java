package com.bilibili.postspace;

public interface PictureSpace {
    String fsname="";
    boolean ifLike=false;
    String fscontent="";
    public void publish(String name);
    public void delete() ;
    public void edit(String content);
    public void like();
    public void forword();
    public String getNews();
}
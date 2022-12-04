package com.bilibili.space;

public interface VedioSpace {
    String fsname="";
    boolean ifLike=false;
    String fscontent="";
    public void publish(String name);
    public void delete() ;
    public void edit(String content);
    public void like();
    public String getNews();

}
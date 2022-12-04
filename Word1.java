package com.bilibili.space;

public class Word1 implements WordSpace{
    String fsname="";
    boolean ifLike=false;
    String fscontent="";
    public void publish(String name) {
        fsname=name;
        System.out.println("Publish Successful");
    }
    public void delete() {
        fscontent="";
        System.out.println("Delete Successful");
    }
    public void edit(String content) {
        fscontent=content;
        System.out.println("Edit Successful");
    }
    public void like() {
        if(ifLike==false) {
            ifLike=true;
            System.out.println("Like Successful");
        }else {
            ifLike=false;
            System.out.println("UnLike Successful");
        }
    }
    public String getNews() {
        return "Word1 ";
    }
}

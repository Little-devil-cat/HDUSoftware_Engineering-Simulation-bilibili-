package com.bilibili.contributing.CheckManuscript;

import java.lang.*;

public enum CreationSubmission {
    Checkers;

    private String name;
    private int password;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public  int getPassword(){
        return password;
    }
    public  void setPassword(int password){
        this.password=password;
    }

    private CreationSubmission(){
        System.out.println("Checker构造中");
    }

    public static CreationSubmission getInstance(){
        return Checkers;
    }
}

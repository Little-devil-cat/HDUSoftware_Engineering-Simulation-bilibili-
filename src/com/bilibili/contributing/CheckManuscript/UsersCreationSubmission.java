package com.bilibili.contributing.CheckManuscript;
import java.lang.*;
public enum UsersCreationSubmission {
    Users;

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

    private UsersCreationSubmission(){
        System.out.println("Users构造中");
    }

    public static UsersCreationSubmission getInstance(){
        return Users;
    }
}

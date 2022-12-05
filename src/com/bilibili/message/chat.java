package com.bilibili.message;

public class chat {
 public String getHistory(){
return "user2:hello time:2022-12-04 16:16:19\nuser2:How are you time:2022-12-04 16:16:56\n";
 }
 public void observer(String ID){
transmission.getMessage(ID);
 }
 public void sendMessage(String ID,String send,String time){
     transmission.sendMessage(ID,send,time);
Manage res = new Manage();
res.observer(ID,send,time);
 }
}

package com.bilibili.message;

public interface transmission {
    static void getMessage(String ID){}
    static void sendMessage(String ID,String text,String time){}
   static void sendNotice(String SID,int RID,String text,String time){}
}

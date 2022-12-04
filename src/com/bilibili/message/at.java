package com.bilibili.message;

public class at {
    public String getnotice(String name){
        //获得初始通知
        String result = "";
        if(name.equals("user1")){
            result = result + "ID:user2 @you in comment context:@user1,I am user2 time:2022-12-04 16:16:19\n";
            result = result + "ID:user3 @you in comment context:@user1,I am user4 time:2022-12-04 16:16:56\n";
        }

        return result;

    }
    public void delete(int number){
        Noticefactory res = new Noticefactory();
        res.getnotice();
        if(number == 1){
            System.out.println("delete success\nnotice now:ID:user3 @you in comment context:@user1,I am user4 time:2022-12-04 16:16:56\n");
        }
        if(number == 2){
            System.out.println("delete success\nnotice now:ID:user2 @you in comment context:@user1,I am user2 time:2022-12-04 16:16:19\n");
        }
    }
    public void response(String SID,int RID,String text,String time){
        Manage res = new Manage();
        res.update(SID,RID,text,time,1);
    }
}

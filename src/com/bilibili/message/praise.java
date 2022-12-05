package com.bilibili.message;

public class praise {
    public String getnotice(String name){
        //获得初始通知
        String result = "";
        if(name.equals("user1")){
            result = result + "ID:user2 praise your comment time:2022-12-04 16:16:19\n";
            result = result + "ID:user3 praise your comment time:2022-12-04 16:16:56\n";
        }

        return result;

    }
    public void delete(int number){
        Noticefactory res = new Noticefactory();
        res.getnotice();
        if(number == 1){
            System.out.println("delete success\nnotice now:ID:user3 praise your comment time:2022-12-04 16:16:56\n");
        }
        if(number == 2){
            System.out.println("delete success\nnotice now:ID:user3 praise your comment time:2022-12-04 16:16:56\n");
        }
    }
}

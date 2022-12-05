package com.bilibili.message;

public class Manage {
    public void update(String SID,int RID,String text,String time,int mode){
        if(mode == 1) {
            transmission.sendNotice(SID, RID, text, time);
            System.out.println("user" + RID + "receive a notice:" + "ID:" + SID + " context:" + text + " time:" + time);
        }
        if(mode == 2){
            transmission.sendNotice(SID, RID, text, time);
            System.out.println(SID + " praised" + " user" + RID + " the notice context is :" + SID +" praised you" + " time:"+time);
        }

    }
    public String getnotice(){
        return "叮！你获得了一个新人福利！2022年9月29日 20:41\n领取任务后7天内发布首稿即可得现金红包，首稿播放量越高现金奖励越大。任务时间结束后，可在【我的-创作首页-新手任务】领取奖励。快来领取你的新手任务吧~\n领取任务>>  网页链接\n进来抽奖，即得100万现金红包瓜分资格！2022年2月5日 00:00\n许愿重磅福利来啦！仅限【2月5日】，参与放飞许愿灯活动，完成1次抽奖，即可获得瓜分100万现金大奖资格，还有机会获得SONY PS5、iPhone13等丰厚大礼，许愿抽奖戳>>>  网页链接\n";
    }
    public void observer(String ID,String text,String time){
        transmission.getMessage(ID);//观察并接收消息
        System.out.println(ID+"getMessage:"+text+" time:"+time+"\n");
    }


}

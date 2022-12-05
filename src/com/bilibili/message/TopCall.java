package com.bilibili.message;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TopCall {
    Scanner in = new Scanner(System.in);
    public void message(String name) {
        System.out.println("请选择消息模块:1-回复我的，2-@我的，3-点赞我的，4-系统消息，5-我的消息");
        int x = in.nextInt();
        switch (x) {
            case 1 : {
                System.out.println("回复我的模块：\n");
                Response user = new Response();
                String notice = user.getnotice(name);
                System.out.println(notice);
                System.out.println("选择进行什么操作：1.response 2.praise 3.delete");
                int y = in.nextInt();
                switch (y) {
                    case (1) : {
                        System.out.println("选择第几个消息：1.1 2.2");
                        int z = in.nextInt();
                        System.out.println("请输入要回复的内容：\n");
                        String response = in.next();
                        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String now = df.format(System.currentTimeMillis());
                        transmission.sendNotice(name, z + 1, response, now);
                        user.response(name, z + 1, response, now);
                        break;

                    }
                    case (2) : {
                        System.out.println("选择第几个消息：1.1 2.2");
                        int z = in.nextInt();
                        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String now = df.format(System.currentTimeMillis());
                        String response = "点赞了你";
                        transmission.sendNotice(name, z + 1, response, now);
                        user.praise(name, z + 1, response, now);
                        break;
                    }
                    case (3) : {
                        System.out.println("选择第几个消息：1.1 2.2");
                        int z = in.nextInt();
                        user.delete(z);
                        break;
                    }
                    default : {
                        System.out.println("非法输入!");
                        System.exit(1);
                        break;
                    }
                }
                break;
            }
            case (2) : {
                System.out.println("@我的模块：\n");
                at user = new at();
                String notice = user.getnotice(name);
                System.out.println(notice);
                System.out.println("选择进行什么操作：1.response 2.delete");
                int y = in.nextInt();
                switch (y) {
                    case (1) : {
                        System.out.println("选择第几个消息：1.1 2.2");
                        int z = in.nextInt();
                        System.out.println("请输入要回复的内容：\n");
                        String response = in.next();
                        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String now = df.format(System.currentTimeMillis());
                        transmission.sendNotice(name, z + 1, response, now);
                        user.response(name, z + 1, response, now);
                        break;
                    }
                    case (2) : {
                        System.out.println("选择第几个消息：1.1 2.2");
                        int z = in.nextInt();
                        user.delete(z);
                        break;
                    }
                    default : {
                        System.out.println("非法输入!");
                        System.exit(1);
                        break;

                    }

                }
                break;

            }
            case (3) : {
                System.out.println("点赞我的模块：\n");
                praise user = new praise();
                String notice = user.getnotice(name);
                System.out.println(notice);
                System.out.println("选择进行什么操作：1.delete");
                int y = in.nextInt();
                if (y == 1) {
                    System.out.println("选择第几个消息：1.1 2.2");
                    int z = in.nextInt();
                    user.delete(z);

                } else {
                    System.out.println("非法输入!");
                    System.exit(1);
                }
                break;
            }
            case (4) : {
                System.out.println("系统通知模块：\n");
                Manage user = new Manage();
                String notice = user.getnotice();
                System.out.println(notice);
                break;
            }
            case (5) : {
                System.out.println("我的消息模块\n");
                chat user = new chat();
                String History = user.getHistory();
                System.out.println(History);
                System.out.println("请输入发送消息：\n");
                String send = in.next();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String now = df.format(System.currentTimeMillis());
                user.sendMessage(name, send, now);
                System.out.print("send success\n");
                break;
            }
            default : {
                System.out.println("非法输入!");
                System.exit(1);
                break;
            }
        }
    }
}

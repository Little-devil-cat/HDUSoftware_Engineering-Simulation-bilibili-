package com.bilibili;

import com.bilibili.contributing.contributingDEMO;
import com.bilibili.message.messageDEMO;
import com.bilibili.postspace.SpaceDemo;
import com.bilibili.shopping.shoppingDEMO;
import com.bilibili.personalspace.personalspaceDEMO;
import com.bilibili.videos.VideoDemo;


public class bilibili {
      public static void main(String[] args){


            System.out.println("消息功能测试");
            System.out.println("---------------------------");
            messageDEMO.main(args);

            System.out.println("个人空间功能测试");
            System.out.println("---------------------------");
            personalspaceDEMO.main(args);

            System.out.println("动态空间功能测试");
            System.out.println("---------------------------");
            SpaceDemo.main(args);

            System.out.println("会员购功能测试");
            System.out.println("---------------------------");
            shoppingDEMO.main(args);

            System.out.println("视频功能测试");
            System.out.println("---------------------------");
            VideoDemo.main(args);


            System.out.println("投稿功能测试");
            System.out.println("---------------------------");
            contributingDEMO.main(args);
      }


}


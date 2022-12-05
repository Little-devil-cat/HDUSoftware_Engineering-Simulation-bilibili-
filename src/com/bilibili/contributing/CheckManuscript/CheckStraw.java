package com.bilibili.contributing.CheckManuscript;
import java.util.Scanner;

public class CheckStraw {
    Scanner in = new Scanner(System.in);
    public void UCMain(){
        Users users1 = new Users();
        Checker checker1 = new Checker();
        System.out.println("输入0退出，输入1进入Checker，输入2进入User");
        int i = in.nextInt();
        if (i==1){
            checker1.makeChecker();
        }
        else if(i==2){
            users1.makeUsers();
        }
        else if(i==0){
            System.exit(0);
        }
        else{
            System.out.println("输入错误");
            UCMain();
        }
    }




}

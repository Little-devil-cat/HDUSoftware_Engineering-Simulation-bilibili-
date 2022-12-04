package com.bilibili.space;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {

    Scanner sc=new Scanner(System.in);
    System.out.println("请输入查找");
    String name= sc.next();






    space listtougao = new ShowTougao();
    space listshoucang = new ShowShoucang();

    ShowSearch showshoucang=new Shoucang();
    ShowSearch showdongtai=new Dongtai();
    ShowSearch showtougao=new Tougao();
    ShowSearch showzhuifan=new Zhuifan();

    listtougao.settg(1);
    listshoucang.setsc(1);

    showdongtai.getDongtai(name);
    showshoucang.getShoucang(name);
    showtougao.getTougao(name);
    showzhuifan.getZhuifan(name);

    }
}
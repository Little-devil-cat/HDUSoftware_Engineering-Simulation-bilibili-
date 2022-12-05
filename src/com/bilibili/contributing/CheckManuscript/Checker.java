package com.bilibili.contributing.CheckManuscript;
import java.util.*;
import java.lang.*;
import com.bilibili.contributing.Main;
import com.bilibili.contributing.EntityManuscript.FactoryStraw;
import com.bilibili.contributing.EntityManuscript.Straw;
import com.bilibili.contributing.util.*;


public class Checker {
    Scanner scanner = new Scanner(System.in);
    private void showMenu(){
        System.out.println("1：锁定");
        System.out.println("2：继续审核");
        System.out.println("3：公开");
        System.out.println("4：展示所有稿件");
        System.out.println("5：退出");
        System.out.println("请Checker选择需要的功能，输入整数1~5");
        getCheckerInput();
    }
    public void show1(int ID){
        Straw Vi = ViUplodeMap.AUTO_LIST1.get(Integer.valueOf(ID));
        System.out.printf("%d	%s	    %s	%s	%s  %s   %s%n", ID, Vi.getName(), Vi.getIntroduction(),
                Vi.getNeedCheck(), Vi.getLock(),Vi.getOvert(), Vi.getFile());
    }//显示ID对应的
    private void show1(){
        System.out.println("------------------目前稿件-------------------");
        System.out.println("序号	稿件名称	简介	是否审核 是否锁定 是否公开  地址");
        for (Integer key : ViUplodeMap.AUTO_LIST1.keySet()) {
            show1(key.intValue());
        }
    }
    public void show2(int ID){
        Straw Ma = MaUplodeMap.AUTO_LIST3.get(Integer.valueOf(ID));
        System.out.printf("%d	%s	    %s	%s	%s  %s   %s%n", ID, Ma.getName(), Ma.getIntroduction(),
                Ma.getNeedCheck(), Ma.getLock(),Ma.getOvert(),Ma.getFile());
    }//显示ID对应的
    private void show2(){
        System.out.println("------------------目前稿件-------------------");
        System.out.println("序号	稿件名称	简介	是否审核 是否锁定 是否公开  地址");
        for (Integer key : MaUplodeMap.AUTO_LIST3.keySet()) {
            show2(key.intValue());
        }
    }
    public void show3(int ID){
        Straw Mu = MuUplodeMap.AUTO_LIST2.get(Integer.valueOf(ID));
        System.out.printf("%d	%s	    %s	%s	%s  %s   %s%n", ID, Mu.getName(), Mu.getIntroduction(),
                Mu.getNeedCheck(),  Mu.getLock(),Mu.getOvert(),Mu.getFile());
    }//显示ID对应的
    private void show3(){
        System.out.println("------------------目前稿件-------------------");
        System.out.println("序号	稿件名称	简介	是否审核 是否锁定 是否公开  地址");
        for (Integer key : MuUplodeMap.AUTO_LIST2.keySet()) {
            show3(key.intValue());
        }
    }
    public void show4(int ID){
        Straw Co = CoUplodeMap.AUTO_LIST4.get(Integer.valueOf(ID));
        System.out.printf("%d	%s	    %s	%s	%s  %s   %s%n", ID, Co.getName(), Co.getIntroduction(),
                Co.getNeedCheck(),  Co.getLock(),Co.getOvert(),Co.getFile());
    }//显示ID对应的
    private void show4(){
        System.out.println("------------------目前稿件-------------------");
        System.out.println("序号	稿件名称	简介	是否审核 是否锁定 是否公开  地址");
        for (Integer key : CoUplodeMap.AUTO_LIST4.keySet()) {
            show4(key.intValue());
        }
    }
    private void getCheckerInput(){
        int Choose,AUTO1_4,ID;
        Choose = scanner.nextInt();
        switch (Choose){
            default:{
                System.out.println("输入了错误的功能代码");
                showMenu();
            }
            case 1:{
                System.out.println("请输入1-4分别为视频，音频，文章，素材");
                AUTO1_4 = scanner.nextInt();
                System.out.println("请输入稿件ID");
                ID = scanner.nextInt();
                switch (AUTO1_4){
                    default: {
                        System.out.println("输入了错误的功能代码");
                        showMenu();
                    }
                    case 1:{
                        com.bilibili.contributing.EntityManuscript.Video Vi = ViUplodeMap.AUTO_LIST1.get(Integer.valueOf(ID));
                        Vi.setLock(true);
                        ViUplodeMap.AUTO_LIST1.remove(Integer.valueOf(ID));
                        ViUplodeMap.AUTO_LIST1.put(Integer.valueOf(ID), Vi);
                    }
                    case 2:{
                        com.bilibili.contributing.EntityManuscript.Music Mu = MuUplodeMap.AUTO_LIST2.get(Integer.valueOf(ID));
                        Mu.setLock(true);
                        MuUplodeMap.AUTO_LIST2.remove(Integer.valueOf(ID));
                        MuUplodeMap.AUTO_LIST2.put(Integer.valueOf(ID), Mu);
                    }
                    case 3:{

                        com.bilibili.contributing.EntityManuscript.Column Co= CoUplodeMap.AUTO_LIST4.get(Integer.valueOf(ID));
                        Co.setLock(true);
                        CoUplodeMap.AUTO_LIST4.remove(Integer.valueOf(ID));
                        CoUplodeMap.AUTO_LIST4.put(Integer.valueOf(ID), Co);
                    }
                    case 4:{
                        com.bilibili.contributing.EntityManuscript.Material Ma = MaUplodeMap.AUTO_LIST3.get(Integer.valueOf(ID));
                        Ma.setLock(true);
                        MaUplodeMap.AUTO_LIST3.remove(Integer.valueOf(ID));
                        MaUplodeMap.AUTO_LIST3.put(Integer.valueOf(ID), Ma);
                    }

                }
                showMenu();
            }
            case 2:{

                showMenu();
            }
            case 3:{
                System.out.println("请输入1-4分别为视频，音频，文章，素材");
                AUTO1_4 = scanner.nextInt();
                System.out.println("请输入稿件ID");
                ID = scanner.nextInt();
                switch (AUTO1_4){
                    default: {
                        System.out.println("输入了错误的功能代码");
                        showMenu();
                    }
                    case 1:{
                        com.bilibili.contributing.EntityManuscript.Video Vi = ViUplodeMap.AUTO_LIST1.get(Integer.valueOf(ID));
                        Vi.setOvert(true);
                        ViUplodeMap.AUTO_LIST1.remove(Integer.valueOf(ID));
                        ViUplodeMap.AUTO_LIST1.put(Integer.valueOf(ID), Vi);
                    }
                    case 2:{
                        com.bilibili.contributing.EntityManuscript.Music Mu = MuUplodeMap.AUTO_LIST2.get(Integer.valueOf(ID));
                        Mu.setOvert(true);
                        MuUplodeMap.AUTO_LIST2.remove(Integer.valueOf(ID));
                        MuUplodeMap.AUTO_LIST2.put(Integer.valueOf(ID), Mu);

                    }
                    case 3:{
                        com.bilibili.contributing.EntityManuscript.Column Co= CoUplodeMap.AUTO_LIST4.get(Integer.valueOf(ID));
                        Co.setOvert(true);
                        CoUplodeMap.AUTO_LIST4.remove(Integer.valueOf(ID));
                        CoUplodeMap.AUTO_LIST4.put(Integer.valueOf(ID), Co);
                    }
                    case 4:{
                        com.bilibili.contributing.EntityManuscript.Material Ma = MaUplodeMap.AUTO_LIST3.get(Integer.valueOf(ID));
                        Ma.setOvert(true);
                        MaUplodeMap.AUTO_LIST3.remove(Integer.valueOf(ID));
                        MaUplodeMap.AUTO_LIST3.put(Integer.valueOf(ID), Ma);

                    }

                }
                showMenu();
            }
            case 4:{
                System.out.println("视频稿件：");
                show1();
                System.out.println("音乐稿件：");
                show3();
                System.out.println("文章稿件：");
                show4();
                System.out.println("素材稿件：");
                show2();

                showMenu();
            }
            case 5:{
                Exit();
            }
        }


    }
    public void Exit(){
        System.out.println("即将退出");
        CheckStraw abc = new CheckStraw();
        abc.UCMain();
    }
    public void makeChecker(){

        String CheckerName;
        int CheckerPassword;

        Scanner scanner=new Scanner(System.in);
        System.out.println("请创建Checker的Name");
        CheckerName=scanner.nextLine();
        System.out.println("请创建Checker的Password");
        CheckerPassword=scanner.nextInt();

        CreationSubmission Checkers = CreationSubmission.getInstance();
        Checkers.setName(CheckerName);
        Checkers.setPassword(CheckerPassword);

        showMenu();
    }
}

package com.bilibili.contributing.CheckManuscript;

import java.util.*;
import java.lang.*;

import com.bilibili.contributing.Main;
import com.bilibili.contributing.EntityManuscript.FactoryStraw;
import com.bilibili.contributing.EntityManuscript.Straw;
import com.bilibili.contributing.util.*;

public class Users {
    Scanner scanner = new Scanner(System.in);

    private void showMenu() {
        System.out.println("1：投稿视频");
        System.out.println("2：投稿音乐");
        System.out.println("3：投稿专栏");
        System.out.println("4：投稿素材");
        System.out.println("5：修改稿件");
        System.out.println("6：删除稿件");
        System.out.println("7:退出");
        System.out.println("请Users选择需要的功能，输入整数1~7");
        getUserInput();
    }

    private void getUserInput() {
        int Choose;
        FactoryStraw Factory = new FactoryStraw();
        Choose = scanner.nextInt();
        scanner.nextLine();
        System.out.println("按Enter键继续");
        scanner.nextLine();
        Straw Video = null, Music = null, Column = null, Material = null;
        switch (Choose) {
            default: {
                System.out.println("输入了错误的功能代码");
                showMenu();
            }
            case 1: {
                Video = Factory.FactoryMain("Vi");
                System.out.println("请输入视频名称");
                Video.setName(scanner.nextLine());
                System.out.println("请输入视频简介");
                Video.setIntroduction(scanner.nextLine());
                System.out.println("按Enter键继续");
                scanner.nextLine();

                Video.setOvert(false);
                Video.setLock(false);
                Video.setNeedCheck(true);
                ViUplodeMap.AUTO_LIST1.put(Integer.valueOf(ViUplodeMap.AUTO_ID++), (com.bilibili.contributing.EntityManuscript.Video) Video);
                showMenu();
            }
            case 2: {
                Music = Factory.FactoryMain("Mu");
                System.out.println("请输入音频名称");
                Music.setName(scanner.nextLine());
                System.out.println("请输入音频简介");
                Music.setIntroduction(scanner.nextLine());
                System.out.println("按Enter键继续");
                scanner.nextLine();

                Music.setOvert(false);
                Music.setLock(false);
                Music.setNeedCheck(true);
                MuUplodeMap.AUTO_LIST2.put(Integer.valueOf(MuUplodeMap.AUTO_ID++), (com.bilibili.contributing.EntityManuscript.Music) Music);
                showMenu();
            }
            case 3: {
                Column = Factory.FactoryMain("Co");
                System.out.println("请输入文章名称");
                Column.setName(scanner.nextLine());
                System.out.println("请输入文章简介");
                Column.setIntroduction(scanner.nextLine());
                System.out.println("按Enter键继续");
                scanner.nextLine();

                Column.setOvert(false);
                Column.setLock(false);
                Column.setNeedCheck(true);
                CoUplodeMap.AUTO_LIST4.put(Integer.valueOf(CoUplodeMap.AUTO_ID++), (com.bilibili.contributing.EntityManuscript.Column) Column);
                showMenu();
            }
            case 4: {
                Material = Factory.FactoryMain("Ma");
                System.out.println("请输入素材名称");
                Material.setName(scanner.nextLine());
                System.out.println("请输入素材简介");
                Material.setIntroduction(scanner.nextLine());
                System.out.println("按Enter键继续");
                scanner.nextLine();

                Material.setOvert(false);
                Material.setLock(false);
                Material.setNeedCheck(true);
                MaUplodeMap.AUTO_LIST3.put(Integer.valueOf(MaUplodeMap.AUTO_ID++), (com.bilibili.contributing.EntityManuscript.Material) Material);
                showMenu();
            }
            case 5:{
                System.out.println("请输入1-4分别为视频，音频，文章，素材");
                int AUTO1_4 = scanner.nextInt();
                System.out.println("请输入稿件ID");
                int ID = scanner.nextInt();
                switch (AUTO1_4){
                    default: {
                        System.out.println("输入了错误的功能代码");
                        showMenu();
                    }
                    case 1:{
                        com.bilibili.contributing.EntityManuscript.Video Vi = ViUplodeMap.AUTO_LIST1.get(Integer.valueOf(ID));
                        System.out.println("请输入视频名称");
                        Vi.setName(scanner.nextLine());
                        System.out.println("请输入视频简介");
                        Vi.setIntroduction(scanner.nextLine());
                        System.out.println("按Enter键继续");
                        scanner.nextLine();
                        ViUplodeMap.AUTO_LIST1.remove(Integer.valueOf(ID));
                        ViUplodeMap.AUTO_LIST1.put(Integer.valueOf(ID), Vi);
                    }
                    case 2:{
                        com.bilibili.contributing.EntityManuscript.Music Mu = MuUplodeMap.AUTO_LIST2.get(Integer.valueOf(ID));
                        System.out.println("请输入音频名称");
                        Mu.setName(scanner.nextLine());
                        System.out.println("请输入音频简介");
                        Mu.setIntroduction(scanner.nextLine());
                        System.out.println("按Enter键继续");
                        scanner.nextLine();
                        MuUplodeMap.AUTO_LIST2.remove(Integer.valueOf(ID));
                        MuUplodeMap.AUTO_LIST2.put(Integer.valueOf(ID), Mu);
                    }
                    case 3:{
                        com.bilibili.contributing.EntityManuscript.Column Co= CoUplodeMap.AUTO_LIST4.get(Integer.valueOf(ID));
                        System.out.println("请输入文章名称");
                        Co.setName(scanner.nextLine());
                        System.out.println("请输入文章简介");
                        Co.setIntroduction(scanner.nextLine());
                        System.out.println("按Enter键继续");
                        scanner.nextLine();
                        CoUplodeMap.AUTO_LIST4.remove(Integer.valueOf(ID));
                        CoUplodeMap.AUTO_LIST4.put(Integer.valueOf(ID), Co);
                    }
                    case 4:{

                        com.bilibili.contributing.EntityManuscript.Material Ma = MaUplodeMap.AUTO_LIST3.get(Integer.valueOf(ID));
                        System.out.println("请输入素材名称");
                        Ma.setName(scanner.nextLine());
                        System.out.println("请输入素材简介");
                        Ma.setIntroduction(scanner.nextLine());
                        System.out.println("按Enter键继续");
                        scanner.nextLine();
                        MaUplodeMap.AUTO_LIST3.remove(Integer.valueOf(ID));
                        MaUplodeMap.AUTO_LIST3.put(Integer.valueOf(ID), Ma);
                    }

                }
                showMenu();
            }
            case 6:{
                System.out.println("请输入1-4分别为视频，音频，文章，素材");
                int AUTO1_4 = scanner.nextInt();
                System.out.println("请输入稿件ID");
                int ID = scanner.nextInt();
                switch (AUTO1_4){
                    default: {
                        System.out.println("输入了错误的功能代码");
                        showMenu();
                    }
                    case 1:{
                        ViUplodeMap.AUTO_LIST1.remove(Integer.valueOf(ID));
                    }
                    case 2:{
                        MuUplodeMap.AUTO_LIST2.remove(Integer.valueOf(ID));
                    }
                    case 3:{
                        CoUplodeMap.AUTO_LIST4.remove(Integer.valueOf(ID));
                    }
                    case 4:{
                        MaUplodeMap.AUTO_LIST3.remove(Integer.valueOf(ID));
                    }
                }
                showMenu();
            }
            case 7:{
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
            case 8:{
                Exit();
            }
        }


    }
    public void Exit(){
        System.out.println("即将退出");
        CheckStraw abc = new CheckStraw();
        abc.UCMain();
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
    public void makeUsers() {
        String UsersName;
        int UsersPassword;

        System.out.println("请创建Users的Name\n");
        UsersName = scanner.nextLine();
        System.out.println("请创建Users的Password\n");
        UsersPassword = scanner.nextInt();

        UsersCreationSubmission Users = UsersCreationSubmission.getInstance();
        Users.setName(UsersName);
        Users.setPassword(UsersPassword);

        showMenu();


    }
}

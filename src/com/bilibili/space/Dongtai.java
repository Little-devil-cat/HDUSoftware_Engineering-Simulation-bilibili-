package com.bilibili.space;


public class Dongtai extends ShowSearch {


    String[] Dongtailist ={"动态1","动态2","动态3","动态4","动态5"};
    @Override
    public Dongtai getDongtai(String name) {
        DT dt=new DT();
        int index=dt.find(name,Dongtailist);
        if(index==-1){
            System.out.println("未找到动态");
        }
        else{
            index+=1;
            System.out.println(name+"为第"+index+"条动态");
        }
        return null;
    }

        class DT{
            public int find(String finder,String[] arr){//finder为要查找的字符串,
                for(int i=0;i<arr.length;i++){
                    if(finder.equals(arr[i])){
                        return i;
                    }
                }
                return -1;//找到的话就是下标 不是就是-1;
            }

    }
    @Override
    public Zhuifan getZhuifan(String name) {
        return null;
    }
    @Override
    public Shoucang getShoucang(String name) {
        return null;
    }
    @Override
    public Tougao getTougao(String name) {
        return null;
    }
}

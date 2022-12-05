package com.bilibili.space;

public class Tougao extends ShowSearch{
    @Override
    public Dongtai getDongtai(String name) {
        return null;
    }
    @Override
    public Zhuifan getZhuifan(String name) {
        return null;
    }
    @Override
    public Shoucang getShoucang(String name) {
        return null;
    }
    String[] Tougaolist ={"投稿1","投稿2","投稿3","投稿4","投稿5"};
    @Override
    public Tougao getTougao(String name) {
        TG tg=new TG();
        int index=tg.find(name,Tougaolist);
        if(index==-1){
            System.out.println("未找到投稿");
        }
        else{
            index+=1;
            System.out.println(name+"为第"+index+"条投稿");
        }
        return null;
    }
    class TG{
        public int find(String finder,String[] arr){//finder为要查找的字符串,
            for(int i=0;i<arr.length;i++){
                if(finder.equals(arr[i])){
                    return i;
                }
            }
            return -1;//找到的话就是下标 不是就是-1;
        }

    }
}

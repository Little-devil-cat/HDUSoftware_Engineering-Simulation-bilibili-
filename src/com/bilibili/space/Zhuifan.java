package com.bilibili.space;
public class Zhuifan extends ShowSearch{
    @Override
    public Dongtai getDongtai(String name) {
        return null;
    }
    @Override
    public Zhuifan getZhuifan(String name) {
        String[] Shoucanglist ={"追番1","追番2","追番3","追番4","追番5"};
        ZF zf=new ZF();
        int index=zf.find(name,Shoucanglist);
        if(index==-1){
            System.out.println("未找到追番");
        }
        else{
            index+=1;
            System.out.println(name+"为第"+index+"条追番");
        }
        return null;
    }
    class ZF{
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
    public Shoucang getShoucang(String name) {
        return null;
    }
    @Override
    public Tougao getTougao(String name) {
        return null;
    }

}

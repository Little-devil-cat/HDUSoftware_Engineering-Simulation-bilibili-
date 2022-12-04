package com.bilibili.space;

public class Shoucang extends ShowSearch{
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

        String[] Shoucanglist ={"收藏1","收藏2","收藏3","收藏4","收藏5"};
        SC sc=new SC();
        int index=sc.find(name,Shoucanglist);
        if(index==-1){
            System.out.println("未找到收藏");
        }
        else{
            index+=1;
            System.out.println(name+"为第"+index+"条收藏");
        }
        return null;

    }
    class SC{
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
    public Tougao getTougao(String name) {
        return null;
    }
}

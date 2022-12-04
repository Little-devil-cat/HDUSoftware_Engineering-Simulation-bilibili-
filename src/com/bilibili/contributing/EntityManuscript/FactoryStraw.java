package com.bilibili.contributing.EntityManuscript;
import java.lang.*;

public class FactoryStraw {


    private static Straw WorkingFactory(String ControlStr){
        try{
            MakeFactoryStraw StrawFactory = new MakeFactoryStraw();

            //获取 Circle 的对象，并调用它的 draw 方法
            Straw straw1 = StrawFactory.getStraw(ControlStr);

            //调用 Circle 的 draw 方法
            straw1.Uplode();
            return straw1;
        }catch(Exception e){
            System.out.println("虽然工厂出错了，但我也不知道到底是哪里出错了");
        }
        return null;
    }
    public Straw FactoryMain(String ControlStr) {
        Straw straw1;
        straw1=WorkingFactory(ControlStr);
        return straw1;
    }

}

package com.bilibili.contributing.EntityManuscript;

public class MakeFactoryStraw {
    public Straw getStraw(String StrawType){
        if(StrawType == null){
            return null;
        }
        if(StrawType.equalsIgnoreCase("Vi")){
            return new Video();
        } else if(StrawType.equalsIgnoreCase("Mu")){
            return new Music();
        } else if(StrawType.equalsIgnoreCase("Co")){
            return new Column();
        } else if(StrawType.equalsIgnoreCase("Ma")){
            return new Material();
        }
        return null;
    }
}

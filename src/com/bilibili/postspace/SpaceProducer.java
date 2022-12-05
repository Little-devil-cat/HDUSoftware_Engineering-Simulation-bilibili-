package com.bilibili.postspace;
import java.util.*;
public class SpaceProducer {
    public static AbstractSpace getSpace(String name) {
        if(name.equalsIgnoreCase("picturespace")) {
            System.out.println("Produce picturespace");
            return new AbstractPictureSpace();
        }
        else if(name.equalsIgnoreCase("wordspace")) {
            System.out.println("Produce wordspace");
            return new AbstractWordSpace();
            //return null;
        }
        else {
            System.out.println("No Item");
            return null;
        }
    }
}
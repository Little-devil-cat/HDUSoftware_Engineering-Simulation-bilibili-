package com.bilibili.space;
import java.util.*;
public class SpaceProducer {
    public static AbstractSpace getSpace(String name) {
        if(name.equalsIgnoreCase("vediospace")) {
            System.out.println("Produce vediospace");
            return new AbstractVedioSpace();
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
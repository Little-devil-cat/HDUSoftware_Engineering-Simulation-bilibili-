package com.bilibili.shopping;

public class serverUser {
    public double buy(double price, discountStrategy...strategy) {
        server server = new server();
        double newprice = price;
        for(discountStrategy str : strategy) {
            server.setStrategy(str);
            newprice = server.getPrice(newprice);
        }
        return newprice;
    }
}

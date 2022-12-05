package com.bilibili.shopping;

public class wallet {

    private payToolsAdapter adapter = null;

    public void pay(String type, double money) {
        if(type.equalsIgnoreCase("钱包")||type.equalsIgnoreCase("银行卡")) {
            adapter = new payToolsAdapter(type);
            adapter.pay(type,money);
        }
        else {
            System.out.println("无效的支付类型："+type);
            System.exit(1);
        }
    }
}

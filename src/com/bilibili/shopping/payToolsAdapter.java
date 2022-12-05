package com.bilibili.shopping;

import java.util.Scanner;

public class payToolsAdapter {

    private payTools paytools = null;

    Scanner in = new Scanner(System.in);

    public payToolsAdapter(String type){
        if(type.equalsIgnoreCase("钱包")) {
            paytools = new change();
        }
        else if(type.equalsIgnoreCase("银行卡")) {
            System.out.println("请选择银行卡：1-农业银行，2-中国银行，3-交通银行");
            int x = in.nextInt();
            switch(x) {
                case 1: paytools = new agriculturalBankCard();
                    break;
                case 2: paytools = new chinaBankCard();
                    break;
                case 3: paytools = new communicationsBankCard();
                    break;
                default:System.out.println("非法输入！");
                    System.exit(1);
            }
        }
    }

    public void pay(String type, double money){
        if(type.equalsIgnoreCase("钱包")) {
            paytools.balancePay(money);
        }
        else if(type.equalsIgnoreCase("银行卡")) {
            paytools.cardPay(money);
        }
    }
}

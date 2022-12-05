package com.bilibili.shopping;

import java.util.Scanner;

public class TopCall {

    Scanner sc = new Scanner(System.in);

    public void shopping() {
        System.out.println("请选择您的服务：\n 1-购买商品\n 2-钱包充值\n 3-零钱提现\n 4-银行卡绑定");
        int x = sc.nextInt();
        switch(x){
            case 1:{
                serverUser user = new serverUser();
                System.out.println("请选择您要购买的商品：\n 1-￥232     《JOJO的奇妙冒险 黄金之风Vol.1》动漫音乐原声集CD" +
                                                     "\n 2-￥999     Myethos《仙剑奇侠传》仗剑江湖李逍遥手办附特典" +
                                                     "\n 3-￥780     ANIPLEX+《青春猪头少年不会梦到兔女郎学姐》樱岛麻衣手办再版" +
                                                     "\n 4-￥1399    赛凡科幻空间三体黑暗森林主题机械键盘阿米洛V2静电容轴" +
                                                     "\n 5-￥109     BANPRESTO英雄勇像《迪迦奥特曼》强力型景品手办附特典");
                int item = sc.nextInt();
                double[] priceList = new double[5];
                priceList[0] = 232.0;
                priceList[1] = 999.0;
                priceList[2] = 780.0;
                priceList[3] = 1399.9;
                priceList[4] = 109.0;
                double price = priceList[item-1];
                double newPrice = 0;
                System.out.println("请选择是否使用优惠：\n 1-使用优惠券\n 2-不使用优惠");
                int choice = sc.nextInt();
                if (choice == 1) {
                    discountStrategy couponDiscount = new couponDiscount();
                    newPrice = user.buy(price, couponDiscount);
                }
                else if(choice == 2) {
                    newPrice = price;
                }
                else {
                    System.out.println("非法输入！");
                    System.exit(1);
                }
                System.out.println("您需要支付的金额为："+newPrice);
                wallet wallet = new wallet();
                System.out.println("请输入支付类型：银行卡 or 钱包");
                String type = sc.next();
                type += sc.nextLine();
                wallet.pay(type,newPrice);
                break;
            }
            case 2:{
                change change = new change();
                change.recharge();
                break;
            }
            case 3:{
                change change = new change();
                change.withDrawal();
                break;
            }
            case 4:{
                bankCardFactory bankfactory = new bankCardFactory();
                bankCard bankcard = null;
                System.out.println("请选择绑定：:1-农行卡，2-建行卡，3-中行卡");
                int choice = sc.nextInt();
                switch(choice) {
                    case 1:{
                        bankcard = bankfactory.getCard("agriculturalbankcard");
                        break;
                    }
                    case 2:{
                        bankcard = bankfactory.getCard("chinabankcard");
                        break;
                    }
                    case 3:{
                        bankcard = bankfactory.getCard("communicationsbankcard");
                        break;
                    }
                    default:
                        System.out.println("非法输入!");
                        System.exit(1);
                }
                bankcard.bind();
                break;
            }
            default:System.out.println("非法输入!");
                System.exit(1);
        }
    }
}

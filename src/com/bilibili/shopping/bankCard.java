package com.bilibili.shopping;

public interface bankCard extends payTools {

    void cardPay(double money);
    void bind();
    int getPw();
    void setBalance(double balance);
    double getBalance();
    int getCardID();
}

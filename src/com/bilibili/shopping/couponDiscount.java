package src.com.bilibili.shopping;

public class couponDiscount implements discountStrategy{

    public double calPrice(double price){

        System.out.println("您有一张8元优惠券！");
        return price-8;

    }

}

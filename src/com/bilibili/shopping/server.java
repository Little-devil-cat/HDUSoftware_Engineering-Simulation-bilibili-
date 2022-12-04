package src.com.bilibili.shopping;


public class server {

    private discountStrategy strategy;

    public void setStrategy(discountStrategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice(double price) {
        return strategy.calPrice(price);
    }
}

package com.kchaste.design.combination;


import java.util.ArrayList;
import java.util.List;

/**
 * @author KChaste Sun
 */
public abstract class Order{
    /**
     * except this attribute also other attribute omit
     */
    private int price;

    private final List<Order> children = new ArrayList<>();

    public void add(Order order) {
        children.add(order);
    }

    public int count() {
        return children.size();
    }

    /**
     * may add a tip
     */
    protected int printThisBefore() {
        return 0;
    }

    /**
     * may use  coupons
     */
    protected int printThisAfter() {
        return 0;
    }

    public int print() {
        printThisBefore();
        printThisAfter();
        return children.stream().mapToInt(Order::print).sum()+printThisBefore()-printThisAfter();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

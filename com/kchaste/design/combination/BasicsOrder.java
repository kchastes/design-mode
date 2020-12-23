package com.kchaste.design.combination;

/**
 * @author KChaste Sun
 */
public class BasicsOrder extends Order {


    public BasicsOrder(Order order){
        this.setPrice(order.getPrice());
    }

}

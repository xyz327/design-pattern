package com.pagoda.platform.share.designpattern.creational.builder;

/**
 * @author xizhou
 * @date 2019/5/28 21:13
 */
public class Client {
    public static void main(String[] args) {
        Order build = Order.builder()
                //
                .drink(new Cola())
                //
                .food(new Dumplings())
                //
                .build();
    }
}

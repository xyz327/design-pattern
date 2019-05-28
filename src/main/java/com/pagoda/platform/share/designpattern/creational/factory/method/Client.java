package com.pagoda.platform.share.designpattern.creational.factory.method;

/**
 * @author xizhou
 * @date 2019/5/28 21:08
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new AFactory();
        Product productA = factory.create();

        factory = new BFactory();
        Product productB = factory.create();
    }
}

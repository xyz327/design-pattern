package com.pagoda.platform.share.designpattern.creational.prototype;

/**
 * @author xizhou
 * @date 2019/5/28 21:17
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Prototype prototype = new Prototype();

        Object objectA = prototype.clone();
        Object objectB = prototype.clone();
    }
}

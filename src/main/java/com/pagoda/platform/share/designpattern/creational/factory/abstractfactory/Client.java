package com.pagoda.platform.share.designpattern.creational.factory.abstractfactory;

import com.pagoda.platform.share.designpattern.creational.factory.abstractfactory.benz.BenzFactory;
import com.pagoda.platform.share.designpattern.creational.factory.abstractfactory.bmw.BmwFactory;

/**
 * @author xizhou
 * @date 2019/5/28 21:12
 */
public class Client {
    public static void main(String[] args) {
        bmw();
        benz();
    }

    private static void benz() {
        CarFactory carFactory = new BenzFactory();
        Bus bus = carFactory.createBus();
        SUV suv = carFactory.createSuv();
    }

    private static void bmw() {
        CarFactory carFactory = new BmwFactory();
        Bus bus = carFactory.createBus();
        SUV suv = carFactory.createSuv();
    }
}

package com.pagoda.platform.share.designpattern.creational.factory.abstractfactory.benz;

import com.pagoda.platform.share.designpattern.creational.factory.abstractfactory.Bus;
import com.pagoda.platform.share.designpattern.creational.factory.abstractfactory.CarFactory;
import com.pagoda.platform.share.designpattern.creational.factory.abstractfactory.SUV;

/**
 * @author xizhou
 * @date 2019/5/28 20:49
 */
public class BenzFactory implements CarFactory {
    @Override
    public SUV createSuv() {
        return new BenzSuv();
    }

    @Override
    public Bus createBus() {
        return new BenzBus();
    }
}

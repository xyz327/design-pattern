package com.pagoda.platform.share.designpattern.creational.factory.abstractfactory.bmw;

import com.pagoda.platform.share.designpattern.creational.factory.abstractfactory.Bus;
import com.pagoda.platform.share.designpattern.creational.factory.abstractfactory.CarFactory;
import com.pagoda.platform.share.designpattern.creational.factory.abstractfactory.SUV;

/**
 * @author xizhou
 * @date 2019/5/28 20:50
 */
public class BmwFactory implements CarFactory {
    @Override
    public SUV createSuv() {
        return new BmwSuv();
    }

    @Override
    public Bus createBus() {
        return new BmwBus();
    }
}

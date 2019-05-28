package com.pagoda.platform.share.designpattern.creational.factory.abstractfactory;

/**
 * @author xizhou
 * @date 2019/5/28 20:44
 */
public interface CarFactory {
    /**
     * 创建Suv
     * @return
     */
    SUV createSuv();

    /**
     * 创建Bus
     * @return
     */
    Bus createBus();
}

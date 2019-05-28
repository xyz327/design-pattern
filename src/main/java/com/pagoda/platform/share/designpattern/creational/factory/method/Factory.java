package com.pagoda.platform.share.designpattern.creational.factory.method;

/**
 * 工厂方法模式 工厂接口
 * @author xizhou
 * @date 2019/5/28 20:36
 */
public interface Factory<T extends Product> {
    T create();
}

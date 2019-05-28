package com.pagoda.platform.share.designpattern.creational.factory.method;

/**
 * @author xizhou
 * @date 2019/5/28 20:38
 */
public class BFactory implements Factory<ProductB> {
    @Override
    public ProductB create() {
        return new ProductB();
    }
}

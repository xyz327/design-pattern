package com.pagoda.platform.share.designpattern.creational.factory.method;

/**
 * @author xizhou
 * @date 2019/5/28 20:38
 */
public class AFactory implements Factory<ProductA> {
    @Override
    public ProductA create() {
        return new ProductA();
    }
}

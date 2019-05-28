package com.pagoda.platform.share.designpattern.structural.proxy;

/**
 * @author xizhou
 * @date 2019/5/28 23:03
 */
public class ProxySubject implements Subject {
    private Subject delegate;

    public ProxySubject(Subject delegate) {
        this.delegate = delegate;
    }

    @Override
    public void doSomething() {
        checkPermission();
        delegate.doSomething();
    }

    private void checkPermission() {

    }
}

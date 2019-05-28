package com.pagoda.platform.share.designpattern.structural.proxy;

/**
 * @author xizhou
 * @date 2019/5/28 23:03
 */
public class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();

        ProxySubject proxySubject = new ProxySubject(realSubject);

        proxySubject.doSomething();
    }
}

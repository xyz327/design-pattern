package com.pagoda.platform.share.designpattern.creational.prototype;

/**
 * @author xizhou
 * @date 2019/5/28 21:16
 */
public class Prototype implements Cloneable {
    private String name;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

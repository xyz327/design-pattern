package com.pagoda.platform.share.designpattern.creational.singleton;

/**
 * 静态内部类, 可以延迟加载
 * @author xizhou
 * @date 2019/5/25 10:48
 */
public class StaticHolderSingleton {
    public static class SingletonHolder{
        private static final StaticHolderSingleton singleton = new StaticHolderSingleton();
    }
    public static StaticHolderSingleton getInstance(){
        return SingletonHolder.singleton;
    }
}

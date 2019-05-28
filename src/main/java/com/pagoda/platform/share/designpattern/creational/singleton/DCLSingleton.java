package com.pagoda.platform.share.designpattern.creational.singleton;

/**
 * 双重检查加锁
 *
 * @author xizhou
 * @date 2019/5/25 10:40
 */
public class DCLSingleton {
    /**
     * 为了能够总是读取到最新的变量，必须加上 {@code}volatile{@code} 关键字
     */
    private static volatile DCLSingleton singleton;

    public static DCLSingleton getInstance() {
        if (singleton == null) {
            synchronized (DCLSingleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}

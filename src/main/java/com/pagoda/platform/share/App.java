package com.pagoda.platform.share;

import org.slf4j.Logger;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Logger.class}, (proxy, method, args1) -> {
           return null;
        });
    }
}

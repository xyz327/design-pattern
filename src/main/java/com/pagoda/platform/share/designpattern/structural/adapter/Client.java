package com.pagoda.platform.share.designpattern.structural.adapter;

/**
 * @author xizhou
 * @date 2019/5/28 22:28
 */
public class Client {
    public static void main(String[] args) {
        TripleSocket tripleSocket = new TripleSocket();
        DoublePlug doublePlug = new DoublePlug();


        tripleSocket.output(new TriplePlugAdapter(doublePlug));
    }
}

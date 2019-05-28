package com.pagoda.platform.share.designpattern.structural.adapter;

/**
 * 三孔插座
 * @author xizhou
 * @date 2019/5/28 22:22
 */
public class TripleSocket {
    public void output(TriplePlug triplePlug){
        triplePlug.input();
    }
}

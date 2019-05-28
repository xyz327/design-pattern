package com.pagoda.platform.share.designpattern.structural.adapter;

/**
 * @author xizhou
 * @date 2019/5/28 22:25
 */

public class TriplePlugAdapter extends TriplePlug {
    private DoublePlug adaptee;

    public TriplePlugAdapter(DoublePlug adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void input() {
        adaptee.input();
    }
}

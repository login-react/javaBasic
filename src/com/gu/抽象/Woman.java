package com.gu.抽象;

/**
 * Created by Administrator on 2018/12/6.
 */
public class Woman extends Person {

    @Override
    public void eat() {
        System.out.println("我是女人爱吃水果");

    }

    @Override
    public void move() {
        System.out.println("我是女人我也爱跑步");
    }
}

package com.gu.抽象;

/**
 * Created by Administrator on 2018/12/6.
 *
 * 继承抽象类的具体类必须实现所有抽象方法
 */
public class Man extends Person {

    @Override
    public void eat() {
        System.out.println("我是男人我爱跑步");
    }

    @Override
    public void move() {
        System.out.println("我是男人爱吃肉");
    }
}

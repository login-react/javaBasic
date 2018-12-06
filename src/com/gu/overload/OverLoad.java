package com.gu.overload;

/**
 * Created by Administrator on 2018/12/5.
 * 关于重载的学习
 * 重载： 这边已经不是根据名称来区别了，而是根据传的参数来区别
 */
public class OverLoad {
    public static void main(String [] args){

        System.out.println(sum(1,2));
        System.out.println(sum(1.0,2.0));
        System.out.println(sum(1L,2L));


    }
    public static int sum(int a, int b){
        return a + b;
    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static long sum(long a, long b){
        return a + b;
    }
}

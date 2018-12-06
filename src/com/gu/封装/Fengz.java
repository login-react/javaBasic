package com.gu.封装;

/**
 * Created by Administrator on 2018/12/6.
 */
public class Fengz {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    /**
     * set用于给字段设置值
     * @param age
     */
    public void setAge(int age) {
        if(age > 0 && age < 100){
            this.age = age;
        }else {
            this.age = 18;
        }
    }

    // 如果这个方法是static的，那么上面的字段也要是static的，否则会报错
    public void setShow(){
        /**
         * 这边还可以对年轮进行比较，如果年轮小于0则默认设置对应的值
         * 如果大于则设置对应的值
         */

        System.out.println("我叫"+ name +"今年的年龄是"+age);
    }
}

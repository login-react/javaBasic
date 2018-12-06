package com.gu.多态;

/**
 * Created by Administrator on 2018/12/6.
 */
 class MoreStatus {
    /**
     * 提高了代码的维护性
     * 提高了代码的扩展性
     */

    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }
}

 class MoreStatus1 extends MoreStatus {
    public void eat(){
        System.out.println("eat1");
    }

    public void sleep(){
        System.out.println("sleep1");
    }
}

class MoreStatus2 extends MoreStatus {
    public void eat(){
        System.out.println("eat2");
    }

    public void sleep(){
        System.out.println("sleep2");
    }
}

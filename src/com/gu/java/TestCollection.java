package com.gu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 2018/12/3.
 * 1、 存储对象可以考虑  1）数组  2）集合
 * 2、 数组存储对象的特点，一旦创建，其长度不可变，真实的存储不可变
 */
public class TestCollection {
   @Test
    public  void testCollection(){
       Collection coll = new ArrayList();
       coll.add("add");
       coll.add("add");
       coll.add("add");
       coll.add("add");
       System.out.println("list设置的值为"+ coll);
       String[] s = {"aa","bb","cc"};
       System.out.println("list转成数组的形式为"+s);

      // 将数组转化为list
       List strlist =  Arrays.asList(s);

       coll.addAll(strlist);
       System.out.println(coll.size());

      // 判断数组是否为空
      System.out.println(coll.isEmpty());

      // 判断集合中是否存在
      System.out.println(coll.contains("add"));

   }

}

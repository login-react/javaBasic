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
       String[] s = {"aa","bb","cc"};

      // 将数组转化为list
       List strlist =  Arrays.asList(s);
       coll.addAll(strlist);
       System.out.println(coll.size());

   }

}

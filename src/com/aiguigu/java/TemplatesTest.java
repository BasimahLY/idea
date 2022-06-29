package com.aiguigu.java;

import com.atguigu.bean.Customer;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author BasimahLY
 * @create 2022-06-28 14:54
 *
 * IDEA中代码模板的位置：settings-Editor-live Templates
 */
public class TemplatesTest {
    //模板六：prsf：可生成私有静态常量 private static final
    private static final Customer cust = new Customer();
    //变形：psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形:psfs
    public static final String NATION = "China";

    //模板一：psvm
    public static void main(String[] args) {
        //模板二:sout
        System.out.println();
        //变形：soutp / soutm / soutv / xxx.out
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args)); //带形参
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);//变量值，就近选择变量

        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","Hanmeimei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add((567));
        for (Object o : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr,倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }
    public void method(){
        System.out.println("TemplatesTest.method");

        //模板五：ifn xxx.null
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        if (list == null) {

        }
        //变形：inn xxx.nn
        if (list != null) {

        }

    }
};



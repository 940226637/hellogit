package org.bjtu.study;

import java.io.PrintStream;
import java.util.*;
import java.math.*;

/*
可变个数形参，数据类型 ... 变量名
形参不同方法之间构成重载
形参类型也相同的数组之间不构成重载
可变个数形参在形参列表中只能有一个，只能声明在末尾
 */
class Overload{

    void mOl(int arg){
        System.out.println(Math.pow(arg,2.0));
    }

    void mOl(int arg,int arg1){
        System.out.println(arg * arg1);
    }

    void mOl(String arg){
        System.out.println(arg);
    }
}

class Data{
    int m;
    int n;
}

public class day2 {

    public static void show(String ... strs){
        int size = strs.length;
        for (String str : strs) {
            System.out.println(str);
        }
    }

    public static void method(int a,int b){
        a *= 10;
        b *= 20;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.exit(0);
    }

    public static void method1(int a,int b){
        PrintStream ps = new PrintStream(System.out) {
            @Override
            public void println(String x) {
                if ("a=10".equals(x)) {
                    x = "a=100";
                } else if ("b=10".equals(x)) {
                    x = "b=200";
                }
                super.println(x);
            }
        };
        System.setOut(ps);
    }

    public static void swap(Data data){
        data.m ^= data.n;
        data.n ^= data.m;
        data.m ^= data.n;
    }

    public static void swap(int[] arr,int i,int j){
       arr[i] ^= arr[j];
       arr[j] ^= arr[i];
       arr[j] ^= arr[i];
    }

    public static int  f(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 4;
        }
        else {
            return f(n - 1) * 2 + f(n - 2);
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(f(10));
    }
}

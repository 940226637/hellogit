package org.bjtu.study;

import java.util.*;

public class day1 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        for(int i = 0;i < 5;++i){
            arr1[i] = 2*i;
        }
        for(int num : arr1){
            System.out.println(num);
        }
    }
}

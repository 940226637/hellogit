package org.bjtu.study;

import java.util.*;
import java.math.*;

/**
 * @author fq
 * @date 2020.11.13
 * @version 1.0
 */

class Student{
    int number;
    int state;
    int score;

    public void showInfo(){
        System.out.format("%d %d %d",this.number,this.state,this.score);
        System.out.println();
    }

    Student(int num,int sta,int sco){
        number = num;
        state = sta;
        score = sco;
    }
}

public class day1 {
    /**
     * @Description search special Student in stu
     * @date 2020.11.13
     * @param stu target array
     */
    public static void searchStuArray(Student[] stu){
        for(Student s : stu){
            if(s.state == 3){
                s.showInfo();
            }
        }
    }

    public static void printStuArray(Student[] stu){
        for(Student s : stu){
            System.out.format("%s %s %s",s.number,s.state,s.score);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Student[] stu = new Student[20];
        int size = stu.length;
        for(int i = 1;i <= 20;++i){
            Student s = new Student(i,(int)((Math.random()*3)+1),(int)((Math.random()*100)+1));
            stu[i-1] = s;
        }

        searchStuArray(stu);

        //bubblesort
        for(int i = 0;i < size - 1;++i){
            for(int j = 0;j < size - i - 1;++j){
                if(stu[j].score > stu[j + 1].score){
                    Student temp = stu[j + 1];
                    stu[j + 1] = stu[j];
                    stu[j] = temp;
                }
            }
        }

        System.out.println("------------------------");

        printStuArray(stu);
    }
}

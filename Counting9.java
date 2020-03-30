package Homework;

import java.util.Scanner;

public class Counting9 {
    public static void main(String[] args) {

        int num;
        int count = 0;//计数器
        for (num=0;num<=100;num++) {
            //判断个位上是否有 9
            if (num % 10 == 9) {
                count++;
            }
            //判断十位上是否有 9
            if (num / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}

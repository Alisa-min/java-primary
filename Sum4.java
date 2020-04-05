package Lesson4;

import java.util.Scanner;

public class Sum4 {
    public static int sum(int num) {
        if (num < 10) {
            return num;
        }
        return num%10+sum(num/10);
    }

    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("每位数相加之和为："+sum(num));
        sc.close();
    }
}

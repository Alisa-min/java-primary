package Lesson4;

import java.util.Scanner;

public class Sum5 {
    public static int sum(int num){
        if (num==1) {
            return 1;
        }
        return num+sum(num-1);
    }

    public static void main(String[] args) {
        System.out.println("请输入n：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("计算结果为："+sum(n));
    }
}

package Lesson4;

import java.util.Scanner;

public class Fib {
    public static int fib(int n){
        if (n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println("请输入你要求的项数：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("第"+n+"项为："+fib(n));
        sc.close();
    }
}

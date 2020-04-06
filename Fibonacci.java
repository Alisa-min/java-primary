package Lesson4;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n){
        if (n==0||n==1||n==2){
            return n;
        }else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("跳的台阶数：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("共有"+fibonacci(n)+"种跳法");
    }
}

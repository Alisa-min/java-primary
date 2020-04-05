package Lesson4;

import java.util.Scanner;

public class Factor {
    public static int factor(int num){
        if (num==1){
            return 1;
        }
        return num*factor(num-1);
    }

    public static void main(String[] args) {
        System.out.println("请输入n：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("结果为："+factor(n));

    }
}

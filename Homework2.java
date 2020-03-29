package Homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        for( i = 2;i<=num;i++){
            if(num%i==0){
                System.out.println(num+"不是素数！");
                break;
            }
        }
        if(num==i){
            System.out.println(num+"是素数！");
        }
    }
}

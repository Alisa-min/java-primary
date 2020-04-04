package Homework;

import java.util.Scanner;

public class Number2 {
    public static int Test(int num){
        int count=0;
        while(num>0){
            if((num & 1) ==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println("二进制为："+Integer.toBinaryString(i));
        System.out.println("1的个数为："+Test(i));
    }

}

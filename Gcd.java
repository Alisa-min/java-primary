package Homework;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        System.out.println("请输入两个正整数：");
        Scanner sc1=new Scanner(System.in);
        int m=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        int n=sc2.nextInt();
        int maxNum=0;
        if(m>n){
            int t;
            t=m;
            m=n;
            n=t;
        }

        for(int i=1;i<=m;i++){
            if(m%i==0&&n%i==0){
                maxNum=i;
                i++;

            }
        }
        System.out.println("最大公约数为："+maxNum);

    }

}

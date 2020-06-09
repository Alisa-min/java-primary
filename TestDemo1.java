package Lesson4;

import java.util.Scanner;

public class TestDemo1 {


    public static int factor(int n){
        int sum = 0;
        for(int i = 1;i <= n;i++){
            /*int ret = 1;
            for(int j = 1;j <= i;j++){
                ret *= j;
            }*/


            sum += factor1(i);
        }
        return sum;
    }



    public static int factor1(int n){
        int ret = 1;
        for(int i = 1;i <= n;i++){
            ret *= i;
        }
        return ret;

    }




    public static int sum(int a,int b){
        return a+b;
    }

    public static int maxNum(int num1,int num2){
        return num1 > num2 ? num1 : num2;

    }



    public static int maxNum1(int num1,int num2,int num3){
        int tmp = num1 > num2 ? num1 : num2;

        return tmp > num3 ? tmp : num3;

    }


    public static void main(String[] args) {

        System.out.println(factor(5));

        System.out.println(factor1(5));

    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        /*
        int n1 = 10;
        int n2 = 20;*/

        int ret = maxNum(n1,n2);

        int ret1 = maxNum1(n1,n2,n3);

        int ret2 = sum(20,80);

        System.out.println(ret);

        System.out.println(ret1);

        System.out.println(ret2);

    }
}

package Homework;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m, i = 1, j, t, k;
        m = n;
        while (m > 9) {        //判断n是几位数
            m = m / 10;
            i++;
        }
        if (n > 9)
            System.out.println("n是" + i + "位数");
        if (n < 10) {            //顺序输出
            System.out.println("n是一位数：" + n);//个位数被10整除都为0，
        } else {

            for (k = i; k > 0; k--) {
                m = n;
                t = 1;
                for (j = 0; j < k - 1; j++) {
                    t *= 10;
                }
                m = m / t;
                m = m % 10;
                System.out.print(m + " ");
            }
        }
    }

}

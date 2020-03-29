package Homework;

public class Sum3 {
    public static void main(String[] args) {
        //方法一：
        double sum1 = 0.0;
        double sum2 = 0.0;
        double sum = 0.0;
        for(double i = 1; i <= 100; i += 2) {
            sum1 += 1 / i;
        }
        for(double i = 2; i <= 100; i += 2) {
            sum2 += 1 / i;
        }
        sum = sum1 - sum2;
        System.out.println(sum);
        //方法二：
        double num = 0.0;
        double n = 1;
        for(double i = 1; i <= 101;i++) {
            num += n / i;
            n = -n;
        }
        System.out.println(num);
    }
}

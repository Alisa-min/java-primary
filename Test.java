package Lesson6;


import java.util.Scanner;

class Calculator {
    public double num1;
    public double num2;

    //实现加法
    public void add () {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    //实现减法
    public void sub() {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    //实现乘法
    public void mul() {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    //实现除法
    public void div() {
        double num1 = this.num1;
        double num2 = this.num2;
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}


public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字:");
        calculator.num1 = sc.nextDouble();
        calculator.num2 = sc.nextDouble();
        calculator.add();;
        calculator.sub();
        calculator.mul();
        calculator.div();
        sc.close();
    }
}

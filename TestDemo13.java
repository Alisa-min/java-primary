package Lesson6;

import java.util.Arrays;



class Calculator{
    private int num1;
    private int num2;


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add(){

        return this.num1 + this.num2;
    }
    public int sub(){

        return this.num1 - this.num2;
    }
    public int mul(){

        return this.num1 * this.num2;
    }
    public double dev(){
        return this.num1*1.0 / this.num2;
    }


}

public class TestDemo13 {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(20);
        System.out.println(calculator.add());
        System.out.println(calculator.sub());
        System.out.println(calculator.mul());
        System.out.println(calculator.dev());


    }


    //交换两个数组
    public static void func(int[] array1,int[] array2){
        for (int i = 0; i < array1.length; i++) {
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }
    }

    public static void main1(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {11,22,33,44,55,66};
        func(array1,array2);
        System.out.println("array1:"+Arrays.toString(array1));
        System.out.println("array2:"+Arrays.toString(array2));
    }
}

package Lesson4;

public class TestDemo2 {


    public static void swap(int x,int y){
        int tmp = x;
        x = y;
        y = tmp;
    }

    public static void main1(String[] args) {
        int a = 10;
        int b = 20;

        swap(a,b);

        System.out.println(a+" "+b);
    }


    public static int sum(int a,int b){
        return a+b;
    }

    public static double sum(double a,double b){
        return a+b;
    }


    public static double sum(double a,double b,double c){
        return a+b+c;
    }


    public static void main(String[] args) {
        double a = 2.2;
        double b = 1.3;

        System.out.println(sum(a,b));

    }


}

package Lesson4;
import java.util.Scanner;

public class TestDemo {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextInt()){
            int num = scan.nextInt();
            System.out.println(num);
        }
    }
    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        scan.close();
    }


    public static void main4(String[] args) {
        int num = 0;
        do {
            System.out.println("hhhhhh");
        }while(num != 0);
    }

    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int sum = 0;
        for(int j = 1;j <= num;j++) {

            int ret = 1;
            for (int i = 1; i <= j; i++) {
                ret *= i;
            }
            sum += ret;
        }
        System.out.println(sum);
    }


    public static void main2(String[] args) {
        /*int a = 10;
        if(a == 10){
            break;
        }*/


        //int i = 1;
        for(int i = 1;i <= 10;i++){
            System.out.println(i);
        }
    }
    public static void main1(String[] args) {

        //找到第一个既能被3也能被5整除的数字
        Scanner scan = new Scanner(System.in);//1
        int num = scan.nextInt();
        while (num <= 20){
            if(num % 15 == 0){
                System.out.println(num);
                //break;
                continue;
            }
            System.out.println("hhhh");
            num++;
        }
    }
}

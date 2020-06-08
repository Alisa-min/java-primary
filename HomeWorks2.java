package Lesson4;

import java.util.Scanner;

public class HomeWorks2 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int i = 31;i >= 1;i -= 2){

            System.out.print(((n>>i)&1)+" ");

        }
        System.out.println();

        for (int i = 30;i >= 0;i -= 2){

            System.out.print(((n>>i)&1)+" ");

        }
    }




    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        System.out.println("count:"+count);

    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0;i < 32;i++){
            if(((n>>i) & 1) == 1){
                count++;
            }
        }
        System.out.println("count:"+count);
    }

}

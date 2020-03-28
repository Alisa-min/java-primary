package Homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println("请输入年龄：");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();

        if(age<=18){
            System.out.println("少年！");
        }else if(age>=19&&age<=28){
            System.out.println("青年！");
        }else if(age>=29&&age<=55){
            System.out.println("中年！");
        }else if(age>=56){
            System.out.println("老年！");

        }
        sc.close();
    }
}

package Homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("**********欢迎使用************");
        System.out.println("**********请输入密码**********");
        for(int i=1;i<=3;i++){
            Scanner sc=new Scanner(System.in);
            String password=sc.nextLine();
            if(password.equals("728430")){
                System.out.println("密码正确！");
                break;
            }else{
                System.out.println("密码错误！！！");
                System.out.println("你还有"+(3-i)+"次机会！");
                if((3-i)>0){
                    System.out.println("**********请重新输入**********");
                }

            }
        }

    }
}

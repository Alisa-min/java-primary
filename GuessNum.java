package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();//如果给定了一个时间戳
        int randNum = random.nextInt(100);//[0,100)
        //int randNum = random.nextInt(100)+100;   //(100,200)

        //System.out.println(randNum);

        while(true){
            System.out.println("请输入你要猜的数字：");
            int num = scan.nextInt();

            if(num < randNum){
                System.out.println("你猜的数字小了！");
            }else if(num == randNum){
                System.out.println("你猜对了！");
            }else{
                System.out.println("你猜的数字大了！");
            }
        }



    }
}

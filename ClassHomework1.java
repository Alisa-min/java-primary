package Lesson6;
import java.util.Scanner;

class Exchange {
    public int num1;
    public int num2;

    //实现交换两个数的值
    public void exchange() {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("交换的值为 num1 = %d, num2 = %d", num1, num2);
    }
}
public class ClassHomework1 {
    public static void main(String[] args) {
        Exchange change = new Exchange();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要交换的两个数:");
        change.num1 = sc.nextInt();
        change.num2 = sc.nextInt();
        change.exchange();
        sc.close(); // 注意要关闭调用方法
         }
}

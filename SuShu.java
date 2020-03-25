package lesson2;

public class SuShu {


    public static void main(String[] args) {
        //方法一：根据判断条件2进行遍历检查，减少遍历次数
//外层循环遍历被除数i(因为1既不是素数也不是和数，所以直接从2开始遍历)
        for (int i = 2; i <= 100; i++) {
//定义一个逻辑值flag，初始值为true
            boolean flag = true;
//内层循环遍历除数j(注意：此处若不取边界，则当i=4时，j=2会因为小于i/2=2而直接跳出内循环)
            for (int j = 2; j <= (i / 2); j++) {
//判断是否存在除数j能整除i，若存在，则修改flag的值并跳出循环
                if (0 == i % j) {
                    flag = false;
                    break;
                }
            }
//根据flag的值判断是否输出i
            if (flag) {
                System.out.print(i + " ");
            }
        }


    }
}

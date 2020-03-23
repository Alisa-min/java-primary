package lesson2;

public class LeapYear2 {
    public static void main(String[] args) {
        int year = 2020;
        if (year % 100 == 0) {
            //判断世纪闰年

            if (year % 400 == 0) {

                System.out.println(year + "是闰年");
            } else {
                System.out.println(year + "不是闰年");
            }
        }else if (year % 4 == 0) {
                System.out.println(year + "是闰年");
            } else {
                System.out.println(year+"不是闰年");
            }

    }
}

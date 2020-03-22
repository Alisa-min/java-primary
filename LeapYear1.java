package lesson2;

public class LeapYear1 {

    public static void main(String[] args) {


        for(int year=1000;year<=2000;year++){
            boolean Isleapyear=false;
            if(year%4==0 && year % 100 !=0){//普通闰年
                Isleapyear=true;
            }
            if(year%400==0){//实际闰年
                Isleapyear=true;
            }
            if(Isleapyear){//是闰年，打印year当前的值
                System.out.print(year+" ");
            }
        }
    }
}

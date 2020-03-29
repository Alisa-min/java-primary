package Homework;



public class LeapYear {
    public static void main(String[] args) {
        for(int year=1000;year<=2000;year++){
            //世纪闰年
            if(year%400==0){
                System.out.println(year);
            }else if(year%4==0&&year%100!=0){//普通闰年
                System.out.println(year);
            }
        }

    }
}

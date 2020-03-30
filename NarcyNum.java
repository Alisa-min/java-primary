package Homework;

public class NarcyNum {
    public static int cube(int num){
        //求一个数的立方
        int ret=1;
        for(int i=1;i<=3;i++){
            ret*=num;
        }
        return ret;
    }
    public static int sumCube(int num){
        //求一个数，每一位上的立方和
        int sum=0;
        while(num>0){
            int i=num%10;
            sum+=cube(i);
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        for(int num=0;num<1000;num++){
            if(num==sumCube(num)&&num>99){
                System.out.println(num);
            }
        }
    }

}

package lesson2;

public class San {


    public static void main(String[] args) {
        int n=100;
        while(n<=200){
            if(n%3==0){

                n++;
                continue;
            }
            System.out.println("3的倍数有："+n);
            n++;
        }
    }
}

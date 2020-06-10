package Lesson4;

public class TestDemo3 {


    public static int fabonaci2(int n){
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;

        for(int i = 3;i <= n; i++ ){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }





    public static int fabonaci(int n){
        if(n ==1 ||n == 2){
            return 1;
        }

        return fabonaci(n-1) + fabonaci(n-2);
    }




    public static int func2(int n){

        if(n < 10){

            return n;

        }
        return n%10 + func2(n/10);
    }



    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n+sum(n-1);
    }


    public static void fac1(int n){

        if(n > 9){
            fac1(n/10);
        }
        System.out.println(n%10);

    }


    public static int fac(int n){
        if(n == 1){
            return 1;
        }
        return n * fac(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fac(5));
       fac1(123);
        System.out.println(sum(4));
        System.out.println(func2(1729));

        System.out.println(fabonaci(5));

        System.out.println(fabonaci2(50));
    }
}

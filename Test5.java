public class Test5 {


    public static void main(String[] args) {


        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        int c = a++;
        System.out.println(a);
        System.out.println(c);

        //短路求值
        System.out.println(10 > 20 && 10 / 0 == 0);
        System.out.println(10 < 20 || 10 / 0 == 0);
    }
}

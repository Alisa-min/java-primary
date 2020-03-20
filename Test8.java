public class Test8 {


    public static void main(String[] args) {


        int a=99;
        int b=66;
        int c=31;
        int tmp = 0;
        if (a < b) {
            tmp = b;
            b = a;
            a = tmp;
        }
        if (a < c) {
            tmp = c;
            c = a;
            a = tmp;
        }
        if (b < c) {
            tmp = c;
            c = b;
            b = tmp;
        }
        System.out.println("max = " + a);
        System.out.println("min = " + c);

    }
}

public class Test7 {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        /*方法一：
        int tmp ;
        tmp = a;
        a = b;
        b = tmp;*/

        /*方法二：
        a += b;
        b = a-b;
        a = a-b;*/


        //方法三：
        a = a^b;
        b = a^b;
        a = a^b;


        System.out.println(a+","+b);
    }
}

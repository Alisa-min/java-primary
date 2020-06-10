package Lesson5;

import java.util.Arrays;

public class TestDemo5{


    public static String myToString(int[] array){

        String  ret = "[";
        for (int i = 0; i < array.length; i++) {

            ret += array[i];
            if (i != array.length-1){
                ret += ",";
            }

        }
        ret += "]";
        return ret;
    }

    public static void main(String[] args) {

        int[] array = {12,34,56,21,9};
        //Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(myToString(array));
    }


    public static int[] func(int[] array){
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i] * 2;
        }
        return tmp;
    }

    public static void main6(String[] args) {

        int[] array = {1,2,3,4,5,6,7};
        int[] ret = func(array);
        //Arrays叫做 操作数组的工具类
        System.out.println(Arrays.toString(ret));
    }

    public static void main5(String[] args) {
        int a = 0;
        System.out.println(a);

        int[] array = null;//array引用的是个空对象
        System.out.println(array);
    }


    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        //将数组  以字符串的形式输出
        System.out.println(Arrays.toString(array));
    }


    public static void swap(int[] array){

        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;

    }



    public static void printArray(int[] arr){
        for (int x:arr) {
            System.out.print(x+" ");

        }
    }


    public static void main3(String[] args) {
        int[] array = {1,2,3,4};
        printArray(array);
        System.out.println();

        int[] array2 = {10,20};
        System.out.println(array2[0]+" "+array2[1]);
        swap(array2);
        System.out.println(array2[0]+" "+array2[1]);
    }


    public static void main2(String[] args) {
        int[] array = {1,2,3,4};
        //int len = array.length;
        //System.out.println(len);

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }

        System.out.println();
        for (int val: array) {
            System.out.print(val+" ");
        };
    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,4};
        int[] array2 = new int[]{11,22,33,44};
        int[] array3 = new int[4];//数组内是4个0
        int a = 10;

        System.out.println(array);
    }
}

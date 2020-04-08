package Lesson5;

import java.util.Arrays;

public class Array2 {
    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static int[] transform(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i] * 2;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] output = transform(arr);
        String newArr = Arrays.toString(arr);
        int[] newArr1 = Arrays.copyOf(arr, arr.length);
        System.out.println("newArr: " + Arrays.toString(newArr1));
        arr[0] = 10;
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("newArr: " + Arrays.toString(newArr1));
        System.out.println(newArr);
        printArray(output);
    }
}

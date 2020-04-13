package Lesson5;

import java.util.Arrays;

public class Array6 {
    //冒泡排序（降序）
    public static void bubbleSort1(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=arr.length-1;j>i;j--){
                if (arr[j-1]<arr[j]){
                    int tmp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
    //冒泡排序（升序）
    public static void bubbleSort2(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j-1]>arr[j]){
                    int tmp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={3,6,4,8,5,9,0};
        bubbleSort1(arr);
        System.out.println(Arrays.toString(arr));
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}

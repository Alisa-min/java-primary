package Lesson5;

import java.util.Arrays;

public class TestDemo6 {


    public static void swap(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left < right){
            while(left < right && array[left] % 2 == 0){
                left++;
            }
            while(left < right && array[right] % 2 != 0){
                right--;
            }
            if(left < right){
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;

             }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        swap(array);
        System.out.println(Arrays.toString(array));
    }


    public static void reverse(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left < right){
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main7(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }


    public static void bubbleSort(int[] array){

        boolean flg = false;//没有发生交换
            for (int i = 0; i < array.length-1; i++) {
                flg = false;
                for (int j = 0; j < array.length-1-i; j++) {
                    if(array[j] > array[j+1]){
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                        flg = true;
                }
             }
             if(flg == false){
                    break;
             }
        }
    }
    public static void main6(String[] args){
        int[] array = {12,2,18,24,76,13};

        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }





    public static boolean isUp(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]){
                return false;
            }

        }
        return true;
    }


    public static void main5(String[] args) {
        int[] array = {1,2,3,10,5,6};
        System.out.println(isUp(array));
    }


    public static int binarySearch(int[] array,int key){

        int left = 0;
        int right = array.length-1;
        while(left <= right){
            int mid = (left + right)>>>1;
            if (key < array[mid]){
                right = mid - 1;
            }else if (key > array[mid]){
                left = mid + 1;

            }else{
                return mid;
            }
        }
        return -1;

    }


    public static void main4(String[] args) {

        int[] array = {1,2,4,6,7,8,9};
        System.out.println("下标："+binarySearch(array, 8));

        System.out.println(Arrays.binarySearch(array, 7));

    }


    public static int find(int[] array,int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                return i;
            }

        }
        return -1;
    }

    public static int max(int[] array){
        int max = array[0];
        for (int i = 2; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }

        }
        return max;
    }

    public static void main3(String[] args) {
        int[] array = {12,2,18,24,76,13};
        System.out.println(max(array));

        int ret = find(array,24);
        System.out.println("下标："+ret);
    }
    /**
     * 数组的拷贝   4种方式
     * for
     * Arrays.copyOf
     * System.arraycopy
     * clone();产生了这个对象的副本  这个方法是Object的克隆方法
     * Object 所有类的父类
     * @param args
     */

    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        /*
        int[] ret = Arrays.copyOf(array,array.length);
         System.out.println(Arrays.toString(ret));*/

        /*
        int[] ret = new int[array.length];

        System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));*/

        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));


    }


    public static int[] copyArray(int[] array){
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];

        }
        return array1;
    }

    public static void main1(String[] args) {

        int[] array = {1,2,3,4,5,6,7};


        int[] array2 = copyArray(array);
        System.out.println(Arrays.toString(array2));

    }
}

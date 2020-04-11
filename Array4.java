package Lesson5;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int[] arr = {9,2,5,7,6,8,3};
        System.out.println(isSorted(arr));
        bubbleSort(arr);
        System.out.println(Arrays .toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
// 该循环结束, left 就指向了一个奇数
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
// 该循环结束, right 就指向了一个偶数
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
// 交换两个位置的元素
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }


    public static void bubbleSort(int[] arr) {
// [0, bound) 构成了一个前闭后开区间, 表示已排序区间
// [bound, length) 构成了一个前闭后开区间, 表示待排序区间
// 每循环一次, 就找到一个合适大小的元素, 已排序区间就增大1.
        for (int bound = 0; bound < arr.length; bound++) {
            for (int cur = arr.length - 1; cur > bound; cur--) {
                if (arr[cur - 1] > arr[cur]) {
                    int tmp = arr[cur - 1];
                    arr[cur - 1] = arr[cur];
                    arr[cur] = tmp;
                }
            }
        } // end for
    } // end bubbleSor
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

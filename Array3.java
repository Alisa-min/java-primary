package Lesson5;

public class Array3 {


    public static double avg(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return (double)sum / (double)arr.length;
    }
    public static int find(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1; // 表示没有找到
    }
    public static int binarySearch(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (toFind < arr[mid]) {
// 去左侧区间找
                right = mid - 1;
            } else if (toFind > arr[mid]) {
// 去右侧区间找
                left = mid + 1;
            } else {
// 相等, 说明找到了
                return mid;
            }
        }
// 循环结束, 说明没找到
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(avg(arr));
        System.out.println(find(arr,3));
    }


}

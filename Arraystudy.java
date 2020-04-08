package Lesson5;

public class Arraystudy {
    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void length(int[] a){
        int len=a.length;
        System.out.println("数组长度为："+len);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        printArray(arr);
        length(arr);

    }
}

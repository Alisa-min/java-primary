package Lesson5;

public class TestDemo8 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,1,4,3};
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        System.out.println(ret);
    }
}

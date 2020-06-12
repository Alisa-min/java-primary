package Lesson5;

public class TestDemo7 {


    public static void main(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[] {1,2,3};
        array[1] = new int[] {4,5};
        //C语言   可以指定列  行可以自动推导
        //java    行必须指定   列不能自动推导
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main2(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        /*for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }*/
        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }*/
        for (int[] tmp:array) {
            for (int x:tmp) {
                System.out.print(x+" ");
            }
            System.out.println();
        }

        }


    /**
     * 二维数组的定义方式
     * @param args
     */
    public static void main1(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] array2 = new int[][] {{1,2,3},{4,5,6}};
        int[][] array3 = new int[2][3];
    }
}

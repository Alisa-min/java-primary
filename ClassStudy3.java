package Lesson6;

class TestDemo{
    public int a;
    public static int count;
    public static void change() {
        count = 100;
        //a = 10; error 不可以访问非静态数据成员
    }
}

public class ClassStudy3 {
    public static void main(String[] args) {
        TestDemo t1 = new TestDemo();
        t1.a++;
        TestDemo.count++;
        System.out.println(t1.a);
        System.out.println(TestDemo.count);
        System.out.println("============");
        TestDemo t2 = new TestDemo();
        t2.a++;
        TestDemo.count++;
        System.out.println(t2.a);
        System.out.println(TestDemo.count);
        TestDemo.change();//无需创建实例对象 就可以调用
        System.out.println(TestDemo.count);
    }
}

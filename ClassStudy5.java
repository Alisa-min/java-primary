package Lesson6;



class Person4 {
    private String name;//实例成员变量
    private int age;
    private String sex;

    //默认构造函数 构造对象
    public Person4() {
        this.name = "caocao";
        this.age = 10;
        this.sex = "男";
    }

    //带有3个参数的构造函数
    public Person4(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void show() {
        System.out.println("name: " + name + " age: " + age + " sex: " + sex);
    }
}
public class ClassStudy5 {
    public static void main(String[] args) {
        Person4 p1 = new Person4();//调用不带参数的构造函数 如果程序没有提供会调用不带参数的构造函数
        p1.show();
        Person4 p2 = new Person4("zhangfei", 80, "男");//调用带有3个参数的构造函数
        p2.show();
    }
}

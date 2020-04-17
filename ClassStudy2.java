package Lesson6;



class Person2{
    public String name = "张三";
    public int age = 18;
    public void show() {
    System.out.println("我叫" + name + ", 今年" + age + "岁");
    }
}

public class ClassStudy2 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        System.out.println(person.name);
        System.out.println(person.age);
        Person2 person2 = new Person2();
        person2.show();

    }
}

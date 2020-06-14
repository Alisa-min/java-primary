package Lesson6;




class Person8{
    //字段   成员变量
    public String name = "gemin";
    public int age = 20;
    public static int size;
    //方法  行为   实例成员方法
    public void eat(){
        int a = 0;//局部变量
        System.out.println("eat()!");
    }
    public void sleep(){
        System.out.println("sleep()!");
    }
    public static void func1(){
        System.out.println("static::func1");
    }

    public void show(){
        System.out.println("我叫"+name+"今年"+age+"岁！");
    }

}
public class TestDemo9 {




    public static void main(String[] args) {
        Person8 per = new Person8();
        per.eat();
        per.sleep();
        per. name = "wangming";
        per.age = 22;

        Person8.func1();


        per.show();

    }

    public static void main3(String[] args) {
        Person8 per = new Person8();
        System.out.println(Person8.size);
    }


    public static void main2(String[] args) {
        Person8 per = new Person8();
        System.out.println(per.name);
        System.out.println(per.age);

    }
    public static void main1(String[] args) {
        //实例化一个对象  通过关键字  new
        Person8 person1 = new Person8();
        Person8 person2 = new Person8();
        Person8 person3 = new Person8();
        Person8 person4 = new Person8();
    }
}

package Lesson6;


class Person5 {
    private String name;//实例成员变量
    private int age;
    private String sex;
    //默认构造函数 构造对象
    public Person5() {
//this调用构造函数
        this("bit", 12, "man");//必须放在第一行进行显示
    }
    //这两个构造函数之间的关系为重载。
    public Person5(String name,int age,String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show() {
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }
}
public class ClassStudy6 {
    public static void main(String[] args) {
        Person5 person = new Person5();//调用不带参数的构造函数
        person.show();
    }
}

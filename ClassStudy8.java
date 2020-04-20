package Lesson6;

class Person7 {
    private String name;
    private int age;
    public Person7(String name,int age) {
        this.age = age;
        this.name = name;
    }
    public void show() {
        System.out.println("name:"+name+" " + "age:"+age);
    }
    //重写Object的toString方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}




public class ClassStudy8 {
    public static void main(String[] args) {
        Person7 person = new Person7("caocao", 19);
        person.show();
        System.out.println(person);
    }
}

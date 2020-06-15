package Lesson6;

class Person9{
    private String name;
    private int age;

    public static int count = 0;

    static{
        count = 99;
        System.out.println("静态代码块");
    }


    {
        //this.name = "zhangfei";
        //count = 99;
        System.out.println("实例代码块");
    }

    public Person9(){
       // this("caocao",18);
        System.out.println("Person<init>");
    }

    public Person9(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Person<String,int>");
    }






    public void eat(){
        System.out.println(this.getName());
        System.out.println(this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person9{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class TestDemo11 {

    public static void main(String[] args) {
        Person9 person = new Person9();
        person.eat();

        new Person9().eat();
        new Person9().getName();
    }

    public static void main2(String[] args) {
        Person9 person = new Person9();
        //System.out.println(Person9.count);


        System.out.println("-----------");
        Person9 person2 = new Person9();
    }
    public static void main1(String[] args) {

        Person9 person = new Person9();

        Person9 person2 = new Person9("gemin", 20);
        System.out.println(person2);
    }
}






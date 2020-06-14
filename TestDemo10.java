package Lesson6;

/**
 * this :   当前对象的引用
 */


class Student{
   private String MyName;
    public int age;


    public String getMyName(){
        return this.MyName;
    }
    public void setMyName(String MyName){
        this.MyName = MyName;//其实就是自己给自己赋值   并没有赋值属性  局部变量优先
    }

    public void func1(){
        System.out.println("func1");
    }
    public void show(){
        System.out.println("我叫"+MyName+"今年"+age+"岁！");
    }



}


//以上是  类的实现者写的代码
//  以下是类的调用者

public class TestDemo10 {

    public static void main(String[] args) {
        Student student = new Student();
        student.setMyName("gemin");
        String str = student.getMyName();
        System.out.println(str);
    }
}

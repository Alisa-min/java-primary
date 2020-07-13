package com.bit.demo;


class Animal{
    public String name;

    public Animal(String name){
        this.name = name;
        System.out.println("Animal(String)");
    }
    public void eat(){

        System.out.println(this.name+"Animal::eat()");
    }

    public void sleep(){

        System.out.println("Animal::sleep()");
    }
}
class Cat extends Animal{

    public Cat(String name){
        super(name);//显式调用;
        super.eat();

        System.out.println("Cat(String)");

    }
    /*public String name;
    public void eat(){
        System.out.println("Cat::eat()");
    }*/
}

class Bird extends Animal{

    public Bird(String name){
        super(name);
        super.eat();
    }
   /* public String name;
    public void eat(){
        System.out.println("Bird::eat()");
    }*/

    public void fly(){
        System.out.println(this.name+"Bird::fly()");
    }
}

public class TestDemo17 {
    public static void main(String[] args) {

        Cat cat = new Cat("miao");
       // cat.name = "miao";
        cat.eat();
        Bird bird = new Bird("bage");
        bird.eat();
        bird.fly();
    }
}

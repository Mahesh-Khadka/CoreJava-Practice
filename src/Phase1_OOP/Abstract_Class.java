package Phase1_OOP;
abstract class Animal {
    abstract void sound();
    void sleep(){
        System.out.println("Sleeping....");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Abstract_Class {
    public static void main(String[] args){
    Dog a = new Dog();
    a.sound();
    }
}

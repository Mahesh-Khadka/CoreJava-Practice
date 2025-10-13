package Phase1_OOP;
class A{
    void display(){
        System.out.println("Hello from Class A.");
    }
}
class B extends A{
     void show(){
        System.out.println("Hello from Class B.");
    }
}
public class Single_Inheritance {
    public static void main(String[] args){
        B b = new B();
        b.show();
        b.display();
    }
}

package Phase1_OOP;
class GrandFather{
    void display() {
        System.out.println("I have a Sugar (GrandFather).");
    }
}

class Father extends GrandFather{
    void show(){
        System.out.println("I have a Sugar(Father).");
    }
}

class Son extends Father{
    void print(){
        System.out.println("I have a Sugar(Son).");
    }
}
public class MultiLevel_Inheritance {
    public static void main(String[] args){
        Son s = new Son();
        s.print();
        s.show();
        System.out.println("***********************************************");
        s.display();
    }
}

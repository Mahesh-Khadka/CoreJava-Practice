package Phase1_OOP;
class Number{
    int num1, num2;
    Number(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
}

class Addition extends Number{
    Addition(int num1, int num2){
        super(num1, num2);
    }
    int display(){
        return num1 + num2;
    }
}

class Multiplication extends Number{
    Multiplication(int num1, int num2) {
        super(num1, num2);
    }

    int show(){
        return num1 * num2;
    }
}
public class Hierarchical_Inheritance {
    public  static void main(String[] agrs){
        Addition a = new Addition(4,2);
        System.out.println("Sum: "+ a.display() );

        Multiplication m = new Multiplication(4,2);
        System.out.println("Product: "+ m.show());
    }
}

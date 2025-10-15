package Phase1_OOP;
class addition{
    int num1, num2;
    void sum(){
        System.out.println("SUM: "+ (num1 + num2));
    }
}
class subtraction extends addition{
    int num3;
    void sum(){
        super.sum();
        System.out.println("SUM: "+ (num1 + num2 + num3));
    }
}
public class MethodOveriding2 {
    public static void main(String[] args){
        subtraction s = new subtraction();
        s.num1 = 4;
        s.num2 = 3;
        s.num3 = 2;
        s.sum();
    }
}

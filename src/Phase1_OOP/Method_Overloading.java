package Phase1_OOP;
class Overload{
    public int sum(int a, int b){
        return a + b;
    }
    public int sum(int x, int y, int z){
        return x + y + z;
    }
}
public class Method_Overloading {
    public static void main(String[] args){
        Overload O = new Overload();
        System.out.println("Sum of Two numbers: "+ O.sum(3,5));
        System.out.println("Sum of Three numbers: "+ O.sum(3,3,2));
    }
}

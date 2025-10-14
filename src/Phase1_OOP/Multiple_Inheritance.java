package Phase1_OOP;
interface Add{
    int sum();
}

interface Division{
    int div();
}

class Numbers implements Add, Division{
    int a, b;
    public int sum(){
        return a + b;
    }
    public int div(){
        return a/b;
    }
}
public class Multiple_Inheritance {
    public static void main(String[] args){
        Numbers n = new Numbers();
        n.a = 10;
        n.b = 2;

        System.out.println("SUM: "+ n.sum());
        System.out.println("Division:"+ n.div());
    }
}

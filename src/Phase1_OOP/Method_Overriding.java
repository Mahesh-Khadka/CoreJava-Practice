package Phase1_OOP;
class Cricket{
    void player(){
        System.out.println("Virat is a king.");
    }
}

class India extends Cricket{
    void player(){
        super.player();
        System.out.println("Dhoni is a GOAT.");
    }
}
public class Method_Overriding {
    public static void main(String[] args){
        India i = new India();
        i.player();
    }
}

package Phase3_Java8_Features;

interface Football{
    void portugal(); //abstract method
    default void brazil(){
        System.out.println("NEYMAR IS MAGICIAN.");
    }
}
class Goat implements Football{
    @Override
    public void portugal() {
        System.out.println("Ronaldo is Goat.");
    }
}

public class Default_Method_Example {
public static void main(String[] args){
    Goat g = new Goat();
    g.portugal();
    g.brazil();
}
}

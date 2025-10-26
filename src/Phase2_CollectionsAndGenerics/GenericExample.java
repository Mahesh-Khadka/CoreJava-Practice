package Phase2_CollectionsAndGenerics;

import java.security.PublicKey;
class Box<T>{
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
public class GenericExample<T>{
   public static void main(String[] args){
       Box<Integer> b = new Box<>();
       b.setValue(100);
       System.out.println("Integer: " + b.getValue());

       Box<String> box = new Box<>();
       box.setValue("Mahesh Khadka");
       System.out.println("String: "+ box.getValue());

   }
}

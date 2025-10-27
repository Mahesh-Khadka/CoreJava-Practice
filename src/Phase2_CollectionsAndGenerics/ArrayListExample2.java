package Phase2_CollectionsAndGenerics;

import java.security.PublicKey;
import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args){
        ArrayList<Integer>numbers = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            numbers.add(i * 10);
        }
        System.out.println(numbers);

        //Allowed duplicates
        numbers.add(30);
        System.out.println(numbers);


        numbers.remove(2);
        System.out.println(numbers);
    }
}

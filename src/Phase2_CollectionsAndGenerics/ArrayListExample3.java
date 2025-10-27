package Phase2_CollectionsAndGenerics;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();

        for(int i = 1; i <= 5; i++ ){
            number.add(i);
        }
        System.out.println("Original List" + number);
        number.remove(2);
        System.out.println("List After removing 3rd element: ");
        for(int num : number ){
            System.out.println(num);
        }
    }
}

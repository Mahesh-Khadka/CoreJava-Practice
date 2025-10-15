package Phase2_CollectionsAndGenerics;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println(list.get(0));

        list.set(2, "cherry");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        System.out.println("Size : "+ list.size());
    }
}

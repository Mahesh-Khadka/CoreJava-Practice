package Phase2_CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Mahesh");
        list.add("Sita");
        list.add("Hari");

        ListIterator<String> it = list.listIterator();

        System.out.println("Forward Iteration:");
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Backward Iteration:");
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }

        it = list.listIterator();
        while (it.hasNext()){
            String name = it.next();
            if(name.equals("Sita")){
                it.set("Ram");
            }
        }
        System.out.println("After Modification: "+ list);
    }
}

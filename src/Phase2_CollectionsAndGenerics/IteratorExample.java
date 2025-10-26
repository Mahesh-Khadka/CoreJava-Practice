package Phase2_CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class IteratorExample {
    public static void main(String[] args){
        TreeMap<Integer, String> map= new TreeMap<>();
        map.put (1, "Mahesh");
        map.put (2, "Sita");
        map.put (3, "Hari");

        Iterator<String> it = map.values().iterator();

        while (it.hasNext()){
            String name = it.next();
            System.out.println(name);

            if(name.equals("Sita")){
                it.remove();
            }
        }
        System.out.println("After Removal: "+ map);
    }
}

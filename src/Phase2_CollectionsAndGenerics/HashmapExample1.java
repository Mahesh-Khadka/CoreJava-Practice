package Phase2_CollectionsAndGenerics;

import java.util.HashMap;

public class HashmapExample1 {
    public static void main(String[] args){
        HashMap<Integer, String> Cricketer = new HashMap<>();

        Cricketer.put(101, "Virat Kohli");
        Cricketer.put(102, "MS Dhoni");
        Cricketer.put(103, "Rohit Sharma");
        Cricketer.put(104, "Suresh Raina");
        System.out.println(Cricketer);

        System.out.println(Cricketer.get(102));

        System.out.println(Cricketer.containsValue("Rohit Sharma"));

        Cricketer.put(104, "Mahesh Khadka");
        System.out.println(Cricketer);

        Cricketer.remove(103);
        System.out.println(Cricketer);

    }
}

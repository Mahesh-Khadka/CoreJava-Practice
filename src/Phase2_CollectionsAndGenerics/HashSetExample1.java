package Phase2_CollectionsAndGenerics;

import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String[] args){
        HashSet<String> footballer = new HashSet<>();
        footballer.add("Messi");
        footballer.add("Ronaldo");
        footballer.add("Neymar");
        footballer.add("Mbappe");
        System.out.println(footballer);

        footballer.remove("Messi");
        System.out.println(footballer);
    }
}

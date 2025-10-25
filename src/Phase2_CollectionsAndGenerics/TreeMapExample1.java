package Phase2_CollectionsAndGenerics;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args){
        TreeMap<Integer, String> books = new TreeMap<>();

        books.put(110, "Think Grow and Rich");
        books.put(107, "I Don't Love You Anymore.");
        books.put(108, "Thank you for Leaving.");
        books.put(109,"Psychology of Money");
        System.out.println(books);

        System.out.println(books.firstKey());
    }
}

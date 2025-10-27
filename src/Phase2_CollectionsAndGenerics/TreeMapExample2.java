package Phase2_CollectionsAndGenerics;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args){
        TreeMap<Integer, String> studentInfo = new TreeMap<>(Collections.reverseOrder());

        studentInfo.put(7, "Virat Kohli");
        studentInfo.put(8, "Ms Dhoni");
        studentInfo.put(9, "Rohit Sharma");
        studentInfo.put(10, "Shubman Gill");

        System.out.println(studentInfo);
    }
}

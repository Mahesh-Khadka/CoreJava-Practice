package Phase2_CollectionsAndGenerics;

import java.sql.Statement;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main (String[] args){
        TreeSet<String> students = new TreeSet<>();
        students.add("Mahesh Khadka");
        students.add("Archana Khadka");
        students.add("Manisha Khadka");
        students.add("Arushi Khadka");
        System.out.println(students);

        students.add("Mahesh Khadka");
        System.out.println(students);

        System.out.println(students.subSet("Archana Khadka", "Mahesh Khadka"));
    }
}

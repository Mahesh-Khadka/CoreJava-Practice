package Phase2_CollectionsAndGenerics;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args){
        HashSet<String> student = new HashSet<>();

        student.add("Mahesh Khadka");
        student.add("Anup Dhungel");
        student.add("Shrajan Bakhri");
        student.add("Sita Chalise");
        student.add("Ramesh Thapa");
        System.out.println(student);
        System.out.println(student.contains("Ramesh Thapa"));

        student.remove("Sita Chalise");
        System.out.println(student);

    }
}

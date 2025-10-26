package Phase2_CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s){
        return this.id - s.id;
    }
}
public class ComparableExample {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(3, "Mahesh Khadka"));
        list.add(new Student(1, "Sita"));
        list.add(new Student(2, "Hari"));

        Collections.sort(list);

        for(Student s : list){
            System.out.println(s.id + " " + s.name);
        }
    }

}

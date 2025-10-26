package Phase2_CollectionsAndGenerics;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students{
    int id;
    String name;
    Students(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class ComparatorExample {
    public static void main(String[] args){
        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students(3, "Mahesh Khadka"));
        list.add(new Students(1, "Sita"));
        list.add(new Students(4, "Mahesh Khadka"));
        list.add(new Students(2, "Hari"));

        Comparator<Students> nameComparator = (s1, s2) -> s1.name.compareTo(s2.name);
        Comparator<Students> idComparator = (s1, s2) -> s1.id - s2.id;
        Comparator<Students> combined = nameComparator.thenComparing(idComparator);
        Collections.sort(list, combined);

        for (Students s :list){
            System.out.println(s.id +" "+ s.name);
        }
    }
}

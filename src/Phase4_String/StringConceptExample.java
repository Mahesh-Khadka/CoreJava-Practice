package Phase4_String;

public class StringConceptExample {
    public static void main(String[] args){
        String s1 = "Mahesh";
        String s2 = "MaHesh";
        System.out.println(s1 == s2);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.length());

        String s3 = new String("Mahesh");
        String s4 = new String("Mahesh");
        System.out.println(s3 == s4);

        StringBuilder sb1 = new StringBuilder("Ram");
        sb1.append(" Thapa");
        sb1.insert(3, " Bahadur");
        System.out.println(sb1);
        String s5 = "Ram Bahadur Thapa";
        System.out.println(s5.equalsIgnoreCase(sb1.toString()));

        StringBuffer sb2 = new StringBuffer("Krishna");
        sb2.append(" Khadka");
        System.out.println("sb2");
    }
}

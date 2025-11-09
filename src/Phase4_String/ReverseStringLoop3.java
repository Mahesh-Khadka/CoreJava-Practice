package Phase4_String;

import java.util.Scanner;

public class ReverseStringLoop3 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your name");
       StringBuilder name = new StringBuilder(sc.next());
       StringBuilder reversed = new StringBuilder();
       for (int i = name.length()-1; i >= 0; i--){
           reversed.append(name.charAt(i));
       }

       System.out.println(reversed);
   }
}

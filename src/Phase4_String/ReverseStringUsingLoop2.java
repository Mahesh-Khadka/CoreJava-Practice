package Phase4_String;

import java.util.Scanner;


public class ReverseStringUsingLoop2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        char[] chars = name.toCharArray();
        String reversed ="";
        for(int i = chars.length - 1; i>=0; i--){
            reversed = reversed + chars[i];
        }
        System.out.println(reversed);
    }
}

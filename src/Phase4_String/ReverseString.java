package Phase4_String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        StringBuilder name = new StringBuilder(sc.next());
        String reverse = name.reverse().toString();
        System.out.println("The reverse of your name is : "+ reverse);

    }
}

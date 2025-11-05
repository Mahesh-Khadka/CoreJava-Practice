package Phase3_Java8_Features;

import java.util.Optional;

public class Optional_Example {
    public static void main(String[] args){
        String name = "Mahesh Khadka";
        Optional<String> opt = Optional.ofNullable(name);

       String result =  opt.orElse("Mahesh Khadka");
       System.out.println(result);
    }
}

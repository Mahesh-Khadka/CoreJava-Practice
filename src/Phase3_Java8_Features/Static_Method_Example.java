package Phase3_Java8_Features;
interface Subtract{
    static int sub(int a, int b){
        return a + b ;
    }
}
public class Static_Method_Example {
    public static void main(String[] args){
        int result = Subtract.sub(2,3);
        System.out.println("Sub = " + result);
    }
}

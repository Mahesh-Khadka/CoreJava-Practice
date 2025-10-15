package Phase1_OOP;
class  Test{
    final int Marks = 98;
    void show(){
        System.out.println("Marks: "+ Marks);
    }
}
public class FinalKeyword {
    public static void main(String[] args){
        Test t = new Test();
      //t.Marks =   67;
        t.show();
    }
}

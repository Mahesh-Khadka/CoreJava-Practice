package Phase3_Java8_Features;

interface Add{
    int sum(int a, int b);
}

public class LambdaExpression_Example {
    public static void main(String[] args){
//        Add add = new Add() {
//            @Override
//            public int sum(int a, int b) {
//            return a + b;
//            }
//        };
       Add add = (a , b) -> a + b;
        System.out.println("SUM = " + add.sum(2, 3));
    }
}

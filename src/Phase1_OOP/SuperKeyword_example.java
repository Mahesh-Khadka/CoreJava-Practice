package Phase1_OOP;
class Person{
    String name;
    Person (String name){
        this.name = name;
    }
}
class Student extends Person{
    int age;
    Student(String name, int age){
        super(name);
        this.age = age;
    }
}

public class SuperKeyword_example {
    public static void main(String[] args){
    Student S = new Student("Mahesh Khadka", 07);
    System.out.println("Info = " + "name:" + S.name + " , " + "age:" + S.age);
    }
}

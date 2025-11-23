package Phase6_MultiThreading;

public class Table {
    public synchronized void printTable(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

}
class MyThread1 extends Thread{
    private  Table t1;
    MyThread1(Table t1){
        this.t1 = t1;
    }

    @Override
    public void run() {
        t1.printTable(5);
    }
}
class MyThread2 extends Thread{
    private Table t2;
    MyThread2(Table t2){
        this.t2 = t2;
    }

    @Override
    public void run() {
        t2.printTable(7);
    }
}
class Multiplication{
    public static void main(String[] args) throws InterruptedException {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
        t1.join();
        System.out.println("*******************");
        t2.join();
        System.out.println("Finished");
    }
}
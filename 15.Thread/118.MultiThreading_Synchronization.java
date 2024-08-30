import java.util.*;
class Table{
    synchronized public static void printTable(int n){
        for(int i = 1; i <= 5; i++){
            System.out.print(i * n + " ");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
        System.out.println();
    }
}

class Test extends Thread{
    Test(){
        super("Thread 1");
        start();
    }
    public void run(){
        Table.printTable(5);
    }
}

class Test1 extends Thread{
    Test1(){
        super("Thread 2");
        start();
    }
    public void run(){
        Table.printTable(4);
    }
}

class ThreadSynchronization{
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test t = new Test();
       
    }
}

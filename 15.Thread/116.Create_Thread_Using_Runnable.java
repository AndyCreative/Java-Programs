import java.util.*;
class Test implements Runnable{
    Test(){}
    public void run(){
        while(true){
            System.out.println(new Date());
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}
class ThreadDemo3{
    public static void main(String[] args) {
        Test t = new Test();
        Thread t1 = new Thread(t);
        t1.start();
    }
}

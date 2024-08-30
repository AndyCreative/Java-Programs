import java.util.*;
class Test extends Thread{
    Test(){
        super("Thread Clock");
        start();
    }
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

class ThreadDemo2{
    public static void main(String[] args) {
        Test t = new Test();
    }
}

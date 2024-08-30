import java.util.*;
class ThreadDemo4{
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                int i = 1;
                while(true){
                    System.out.println(i);
                    i++;
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e){}
                }
            }
        };
        t.start();
    }
}

class Test extends Thread{

    Test(){
        super("Thread Clock"); //New Born Thread
        System.out.println("New Born Thread");
        System.out.println("Thread Start");
        start();
    }
    public void run(){
        System.out.println("Thread runnable");
        try{
            System.out.println("Thread Blocked");
            Thread.sleep(5000);
            resume();
            System.out.println("Thread Resume");
            System.out.println("Thread Stop");
            stop();
        }
        catch(Exception e){}
    }
}

class ThreadDemo1{
    public static void main(String[] args) {
        Test t = new Test();
    }
}

class Test extends Thread{
    Test(String name){
        super(name);
        start();
    }
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.print(i + " ");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
        System.out.println();
    }
}

class ThreadJoinMethod{
    public static void main(String[] args) {
        Test t1 = new Test("ONE");
        Test t2 = new Test("TWO");
        Test t3 = new Test("THREE");
        try{
            t1.join();
            t2.join();
            t3.join();
        }
        catch(Exception e){}

        System.out.println("Main Exit");
    }
}

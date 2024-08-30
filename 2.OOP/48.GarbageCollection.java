class first{
    public void finalize(){
        System.out.println("Object Collected by garbage collector");
    }
}
class GarbageCollector {
    public static void main(String[] args) {
        first f1 = new first();
        f1 = null;
        System.gc();
    }    
}

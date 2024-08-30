interface MyInterface{
    int i = 10;
    void display();
}
class InterfaceDemo1 implements MyInterface{
    public void display(){
        System.out.println("Interface Demo");
    }    
    public static void main(String[] args) {
        InterfaceDemo1 i1 = new InterfaceDemo1();
        i1.display();        
    }
}

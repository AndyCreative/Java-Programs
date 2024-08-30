interface MyInterface{
    int i = 10;
    void display();
}

interface MyInterface2{
    void print();
}
class InterfaceDemo1 implements MyInterface,MyInterface2{
    public void display(){
        System.out.println("Interface1 Demo");
    }    
    public void print(){
        System.out.println("Interface2 Demo");
    }
    public static void main(String[] args) {
        InterfaceDemo1 i1 = new InterfaceDemo1();
        i1.display();  
        InterfaceDemo1 i2 = new InterfaceDemo1();
        i2.print();    
    }
}

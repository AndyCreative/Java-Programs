interface MyInterface1{
    int i = 10;
    void display();
}

interface MyInterface2 extends MyInterface1{
    void print();
}

class InterfaceDemo2 implements MyInterface2{
    public void display(){
        System.out.println("Interface1 Demo");
    }
    public void print(){
        System.out.println("Interface2 Demo");
    }

    public static void main(String[] args) {
        // InterfaceDemo2 i1 = new InterfaceDemo2();
        // i1.display();

        InterfaceDemo2 i2 = new InterfaceDemo2();
        i2.display();
        i2.print();
    }
}

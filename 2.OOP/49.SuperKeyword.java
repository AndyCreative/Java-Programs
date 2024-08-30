class A{
    int x;
    A(int x){
        System.out.println("Super Class Constructor");
        this.x = x;
    }
    void show(){
        System.out.println("Show Method Parent Class x : " + x);
    }
}

class B extends A{
    int y;
    B(int x, int y){
        super(x);
        this.y = y;
        System.out.println("Child Class Constructor");
    }
    void print(){
        super.show();
        System.out.println("Print Method Child Class y : " + y);
        System.out.println("Print Method Parent Class x : " + super.x);
    }
}

class SuperKeyword {
    public static void main(String[] args) {
        B b = new B(10,20);
        b.print();
    }
}

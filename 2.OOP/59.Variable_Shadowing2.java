class A{
    final int i = 100;
}

class B extends A{
    int i = 200;
}

class VariableShadowing {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.i);
        a.i = 500;
        System.out.println(b.i);
    }
}

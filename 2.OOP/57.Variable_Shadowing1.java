class A{
    final int i = 100;
}

class B extends A{
    int i = 200;
}

class VariableShadowing {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.i);
    }
}

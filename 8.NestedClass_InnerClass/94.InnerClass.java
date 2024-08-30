// Nested Class -  Inner Class
class Test{
    int x = 100;
    class A{
        int x = 200;
        void display(){
            int x = 300;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Test.this.x);
        }
    }
}
class InnerClass{
    public static void main(String[] args) {
        Test t = new Test();
        Test.A InnerObj = t.new A();
        InnerObj.display();
    }
}

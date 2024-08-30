//A.java
package same;
public class A {
    public int a = 10;
    public int b = 20;
    protected int c = 30;
    int d = 40;
}
//B.java
package same;
public class B{
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}

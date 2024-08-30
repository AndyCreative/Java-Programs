//A.java
package same;
public class A {
    public int a = 10;
    public int b = 20;
    protected int c = 30;
    public int d = 40;
}
//C.java
package another;
import same.A;
public class C extends A{
    public static void main(String[] args) {
        C obj = new C();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}

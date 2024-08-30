import java.util.*;
class CollectionGeneric{
    public static void printCollection(Collection<? extends Number> c){
        for (Object o : c){
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        Collection<Number> c = new ArrayList<Number>();
        c.add(100);
        c.add(12345678910l);
        c.add(3.14);
        c.add(10.10f);
        CollectionGeneric.printCollection(c);
    }
}

import java.util.*;
class CollectionDemoIterator {
    public static void main(String[] args) {
        int index = 0;
        Collection<Object> c = new ArrayList<Object>();
        c.add(100);
        c.add(true);
        c.add(123456789l);
        c.add(3.14);
        c.add('A');
        c.add("Atmiya University");

        Iterator i = c.iterator();
        while (i.hasNext()) {
            System.out.println(index + " " + i.next());
            index++;
        }
    }
}

import java.util.*;
class CollectionArrayList {
    public static void main(String[] args) {
        Collection<Object> c = new ArrayList<Object>();
        c.add(100);
        c.add(true);
        c.add(123456789110l);
        c.add("Atmiya");
        c.add(3.14);
        c.add('A');
        System.out.println(c);
        // size() method
        System.out.println("size() method : ");
        System.out.println("Size of the the ArrayList: " + c.size());

        // remove() method
        c.remove(3.14);
        System.out.println("\nremove() method : ");
        System.out.println("Remove the element 3.14 in ArrayList: " + c);

        // contains() method
        System.out.println("\ncontains() method : ");
        System.out.println("Checks if the ArrayList contains the element A in the ArrayList: " + c.contains('A'));

        // isEmpty() method
        System.out.println("\nisEmpty() method : ");
        System.out.println("Checks if the ArrayList is empty or not : " + c.isEmpty());

        // clear() method
        System.out.println("\nclear() method : ");
        c.clear();
        System.out.println("Checks if the ArrayList is empty or not : " + c.isEmpty());
    }    
}

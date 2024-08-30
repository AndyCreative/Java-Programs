import java.util.*;
class VarArgsDemo2 {
    void display(Object... oa){
        System.out.println("Before Sorting : ");

        for(Object o : oa){
            System.out.println(o + "\t");
        }
        System.out.println();
        System.out.println("After Sorting : ");
       
   Arrays.sort(oa);
        for(Object o : oa){
            System.out.println(o + "\t");
        }
    }
    public static void main(String[] args) {
        VarArgsDemo2 val = new VarArgsDemo2();
        val.display(10,9,85,65,32,59,47,56,25);
        val.display("MBA","BCOM","PGDCA","MA","MCA","BCA");
    }  
}

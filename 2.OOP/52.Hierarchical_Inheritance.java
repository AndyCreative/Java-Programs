// Hierarchical Inheritance
class Ram{
    String parentName = "Ram Mehta";
    int parentAge = 50;
   
    void ParentPrintName(){
        System.out.println("Parent Name : " + parentName);
    }
}

class Luv extends Ram{
    String childName = "Luv Mehta";
    int childAge = 20;
   
    void ChildPrintName(){
        System.out.println("Child Name : " + childName);
    }
}

class Kush extends Ram{
    String childName = "Kush Mehta";
    int childAge = 20;
   
    void ChildPrintName(){
        System.out.println("Child Name : " + childName);
    }
}

class HierarchicalInheritance {
    public static void main(String[] args) {
        Luv l = new Luv();
        Kush k = new Kush();
        l.ParentPrintName();
        k.ParentPrintName();
    }
}

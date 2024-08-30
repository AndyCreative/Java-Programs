class GrandParent{  // Super Class, Parent Class
    String grandParentName = "Sarvoday Kelavni Samaj";
    int grandParentAge = 50;

    void GrandParentPrintName(){
        System.out.println(grandParentName);
    }
}
class Parent extends GrandParent{   // Super Class, Parent Class
    String parentName = "Atmiya University";
    int parentAge = 20;
   
    void ParentPrintName(){
        System.out.println(parentName);
    }
}
class Child extends Parent{     // Sub Class, Child Class
    String childName = "MCA";
    int childAge = 50;
   
    void ChildPrintName(){
        System.out.println(childName);
    }
}
class MultiLevelInheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.GrandParentPrintName();
        c1.ParentPrintName();
        c1.ChildPrintName();
    }
}

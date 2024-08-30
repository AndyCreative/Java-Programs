class Parent1{
    String parentName = "Atmiya University";
    int parentAge = 20;
   
    void Parent1PrintName(){
        System.out.println(parentName);
    }
}
class Parent2{
    String parentName = "Atmiya University";
    int parentAge = 20;
   
    void Parent2PrintName(){
        System.out.println(parentName);
    }
}
class Child extends Parent1, Parent2{
    String childName = "MCA";
    int childAge = 50;
   
    void ChildPrintName(){
        System.out.println(childName);
    }
}
class MultipleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.Parent1PrintName();
        c.Parent2PrintName();
    }
}

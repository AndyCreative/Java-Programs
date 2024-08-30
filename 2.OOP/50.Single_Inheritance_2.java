// Single Inheritance
class Parent{
    String ParentName = "Atmiya";
    int ParentAge = 20;
}
class Child extends Parent{
    Child(){
        System.out.println("Child Constructor");
    }
    String ChildName = "MCA";
    int ChildAge = 10;
    void PrintName(){
        System.out.println("Child Name via method : " + ChildName);  
    }
}
class SingleInheritance{
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.PrintName();
        System.out.println("Child Age : " + c1.ChildAge);
        System.out.println("Parent Name : " + c1.ParentName);
        System.out.println("Parent Age : " + c1.ParentAge);
    }
}

// Single Inheritance
class Parent{
    String ParentName = "Atmiya";
    int ParentAge = 20;
}

class Child extends Parent{
    String ChildName = "MCA";
    int ChildAge = 10;
}

class SingleInheritance{
    public static void main(String[] args) {
        Child c1 = new Child();
        System.out.println("Child Name : " + c1.ChildName);
        System.out.println("Child Age : " + c1.ChildAge);
        System.out.println("Parent Name : " + c1.ParentName);
        System.out.println("Parent Age : " + c1.ParentAge);
    }
}

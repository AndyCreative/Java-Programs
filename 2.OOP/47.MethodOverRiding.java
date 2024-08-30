// Method Overriding
class Animal{
    void move(){
        System.out.println("Parent Class Method Called");
    }
}

class Dog extends Animal{
    void move(){
        System.out.println("Child Class Method Called");
    }
}

class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.move();
        Dog d = new Dog();
        d.move();
        Animal b = new Dog();
        b.move();
    }
}

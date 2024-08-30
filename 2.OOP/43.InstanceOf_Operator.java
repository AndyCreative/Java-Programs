class Parent{
}
class Child extends Parent{
}
class InstanceOfOperator{
    public static void main(String[] args) {
        Parent father = new Parent();
        Child son = new Child();

        System.out.println(father instanceof Parent);
        System.out.println(son instanceof Child);

        System.out.println(son instanceof Parent);
        System.out.println(father instanceof Child);
    }    
}

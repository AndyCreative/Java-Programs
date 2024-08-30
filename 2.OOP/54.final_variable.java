class A{
    final int i = 100;
}
class FinalKeywordDemo{
    public static void main(String[] args){
        A a = new A();
        a.i = 200;
        System.out.println(a.i);
    }
}

class Display{
    void msg(){
        System.out.println("Anonymous Class Test");
    }
}

class AnonymousInnerClass {
    public static void main(String[] args) {
        Display d = new Display(){
            void msg(){
                System.out.println("Anonymous Class Demo");
            }
        };
        d.msg();
    }
}

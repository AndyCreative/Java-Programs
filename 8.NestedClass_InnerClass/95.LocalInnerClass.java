class LocalInnerClass{
    private int data = 200;
    void Display(){
        class Local{
            void msg(){
                System.out.println("Local Inner Class : " + data);
            }
        }
        Local l = new Local();
        l.msg();
    }
    public static void main(String[] args) {
        LocalInnerClass LID = new LocalInnerClass();
        LID.Display();
    }
}

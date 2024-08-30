class ExceptionDemo1{
    public static void main(String[] args){
        int a = 20;
        int b = 0;

        try{
            System.out.println(a/b);
        }catch(ArithmeticException ae){
            System.out.println("Can not divided by zero");
        }
    }
}

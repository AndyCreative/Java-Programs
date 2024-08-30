class ExceptionDemo4{
    public static void main(String[] args) {
        int a = 20, b = 0;

        try{
            b = Integer.parseInt(args[0]);
        }
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("At least one argument is required");
        }
        catch(NumberFormatException nfe){
            System.out.println("Please, enter only numeric value. ");
        }

        try{
            System.out.println(a / b);
        }
        catch(ArithmeticException ae){
            System.out.println("Number is not divided by zero or string or null");
        }
    }
}
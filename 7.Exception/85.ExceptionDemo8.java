class ExceptionDemo8{
    public static void main(String[] args) {
        int a = 20, b = 0;

        try{
            b = Integer.parseInt(args[0]);
            System.out.println(a / b);
        }
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("At least one argument is required");
        }
        catch(NumberFormatException nfe){
            System.out.println("Please, enter only numeric value. ");
        }
        catch(ArithmeticException ae){
            System.out.println("Number is not divided by zero or string or null");
        }
        catch(Exception e){
            System.out.println("|| Any other exception || ");
        }
        finally{
            System.out.println("Finally Block will execute always...");
        }
       
        System.out.println("End of main method");
    }
}

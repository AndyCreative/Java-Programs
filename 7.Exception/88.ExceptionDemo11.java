class ExceptionDemo11 {
    public static void main(String[] args) {
         int a = 20, b = 0;


        try{
            b = Integer.parseInt(args[0]);
            System.exit(0);
        }
        finally{
            System.out.println("Finally Block will execute always...");
        }
        System.out.println("End of main method");
    }    
}

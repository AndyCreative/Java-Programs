class DataTypeConversion4{
    public static void main(String[] s){
        byte b = 100;
        int i = b; //Implicit
        byte no = (byte)i; //Explicit
        System.out.println(i + " " + no);
        
        long l = 1003;
        float f = 3.14f;
        l = (long)f;
        System.out.println(l);
    }
} 

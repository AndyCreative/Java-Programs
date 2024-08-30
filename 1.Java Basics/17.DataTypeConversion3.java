class DataTypeConversion3{
    public static void main(String[] s){
        byte no1 = 10;
        byte no2 = 20;

        // error: incompatible types: possible lossy conversion from int to byte
        // byte sum = no1 + no2;

        int sum = no1 + no2; //Implicit Conversion
        System.out.println(sum);

       // byte sum1 = (byte)no1+no2; //error: incompatible types: possible lossy conversion from int to byte

        byte sum1 = (byte)(no1+no2); //Explicit Conversion
        System.out.println(sum1);
    }
}

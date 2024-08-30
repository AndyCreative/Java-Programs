class DataTypeConversion2{
    public static void main(String[] s){
        byte b=100;
        System.out.println(b);

        // Error
        // byte b=130;
        // System.out.println(b);

        byte c = (byte)130;
        System.out.println(c);

        byte d = (byte) 256;
        System.out.println(d);
    }
}

class DataTypeConversion5{
    public static void main(String[] args) {
        char c = 'A';
        char d = 65;
        System.out.println(c + " " + d);
        System.out.println(c + d); // A = 65 -> 65+65

        boolean b = true;
        System.out.println(" " + b);

        if(b){
            System.out.println(" True ");
        }else{
            System.out.println(" False ");
        }
    }
}

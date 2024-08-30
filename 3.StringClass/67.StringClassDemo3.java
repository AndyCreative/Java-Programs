class StringDemo3 {
    public static void main(String[] args) {
        String s1 = "Atmiya";
        String s2 = "Atmiya";
        String s3 = "atmiya";
        System.out.println("s1.compareTo(s2) : " + s1.compareTo(s2));
        System.out.println("s2.compareTo(s3) : " + s2.compareTo(s3));
        System.out.println("s3.compareTo(s1) : " + s3.compareTo(s1));
        
  System.out.println("\nS1(Lower Case) : " + s1.toLowerCase());
        System.out.println("S3(Upper Case) : " + s3.toUpperCase());
    }    
}

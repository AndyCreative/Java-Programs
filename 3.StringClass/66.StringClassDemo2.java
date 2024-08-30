class StringDemo2{
    public static void main(String[] args) {
        String s1 = "Atmiya";
        String s2 = "Atmiya";
        String s3 = "Good Morning";
        String s4 = "ATMIYA";

        // System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4);

        // if (s1 == s2){
        //     System.out.println("Equal String");
        // }

        System.out.println("\ns1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));
        System.out.println("s1.equals(s4) : " + s1.equals(s4));
        System.out.println("s1.equalsIgnoreCase(s4) : " + s1.equalsIgnoreCase(s4));
    }
}

// Ways to create a String
class StringDemo1{
    public static void main(String[] args) {
        char c[] = {'J','A','V','A'};
        String s1 = new String(c);
        String s2 = new String(s1);
        String s3 = "JAVA";

        System.out.println("S1 :  " + s1);
        System.out.println("S2 :  " + s2);
        System.out.println("S3 :  " + s3);
    
}
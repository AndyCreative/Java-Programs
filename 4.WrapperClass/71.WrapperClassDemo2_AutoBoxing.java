class WrapperDemo2 {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        char c = 'a';
        int i = 100;
        long l = 300;
        float f = 1.0f;
        double d = 3.18;
        boolean bool = true;

        Byte bObj = b ; // Auto Boxing
        Short sObj = s ; // Auto Boxing
        Character cObj = c ; // Auto boxing
        Integer iObj = i ; // Auto Boxing
        Long lObj = l ; // Auto Boxing
        Float fObj = f ; // Auto Boxing
        Double dObj = d ; // Auto Boxing
        Boolean boolObj = bool ; // Auto Boxing

        System.out.println(b + "\t" + bObj.byteValue());
        System.out.println(s + "\t" + sObj);
        System.out.println(c + "\t" + cObj);
        System.out.println(i + "\t" + iObj.intValue());
        System.out.println(l + "\t" + lObj);
        System.out.println(f + "\t" + fObj);
        System.out.println(d + "\t" + dObj);
        System.out.println(bool + "\t" + boolObj);

    }    
}

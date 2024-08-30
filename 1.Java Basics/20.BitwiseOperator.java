class BitwiseOperator{
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 8;
        System.out.printf("%-7s %-4s %7s\n","No1 = ", no1 , Integer.toBinaryString(no1));
        System.out.printf("%-7s %-4s %7s\n","No2 = ", no2 , Integer.toBinaryString(no2));

        System.out.printf("%-7s %-4s %7s\n","& = ", (no1 & no2) , Integer.toBinaryString(no1&no2));
        System.out.printf("%-7s %-4s %7s\n","| = ", (no1 | no2) , Integer.toBinaryString(no1|no2));
        System.out.printf("%-7s %-4s %7s\n","^ = ", (no1 ^ no2) , Integer.toBinaryString(no1^no2));

        System.out.printf("%-7s %-4s %7s\n","<<2 = ", (no1<<2) , Integer.toBinaryString(no1<<2));
        System.out.printf("%-7s %-4s %7s\n",">>2 = ", (no1>>2) , Integer.toBinaryString(no1>>2));
    }
}

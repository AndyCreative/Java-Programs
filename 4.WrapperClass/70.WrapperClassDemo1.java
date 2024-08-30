class WrapperDemo1 {
    public static void main(String[] args) {
        int no = 12345;
        Integer iNo = no; // Auto Boxing
        // Integer iNo = new Integer(no);

        System.out.println(iNo);
       
        String sNo = iNo.toString();
        System.out.println(iNo);
    }    
}

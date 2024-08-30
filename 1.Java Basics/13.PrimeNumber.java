class prime{
    public static void main(String[] s){
        int no = Integer.parseInt(s[0]);
        int flag = 0;
        int i;

        for(i = 2; i<no; i++){
            if(no % i == 0){
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.println("Number is not prime");
        }else{
            System.out.println("Number is prime");
        }
    }
}

class primeNo{
    public static void main(String[] s){
        int no = Integer.parseInt(s[0]);
        int i,j;

        for(i = 1; i <= no ; i++){
            int count = 0;
            for(j = 1; j < i ; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("Prime Number : " + i);
            }
            else{
                System.out.println("Not Prime Number : " + i);
            }
        }
    }
}

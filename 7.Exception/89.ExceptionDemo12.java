class ExceptionDemo12 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("MCA - Atmiya");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                System.out.println("Interrupted exception");
            }
        }
    }
}

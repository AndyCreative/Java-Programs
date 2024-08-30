class Calculation{
    int no1;
    int no2;

    void sum(){
        no1 = 10;
        no2 = 20;
        System.out.println("Addition : " + (no1 + no2));
    }

    void sum(int no10, int no20){
        no1 = no10;
        no2 = no20;
        System.out.println("Sum with 2 parameters : " + (no1 + no2));
    }
}

class MethodOverloadingDemo{
    public static void main(String[] args){
        Calculation obj = new Calculation();
        obj.sum();
        obj.sum(10,20);
    }
}

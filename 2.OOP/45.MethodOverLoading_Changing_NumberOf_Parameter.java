// Method Overloading by changing number of argument
class Calculation{
    int no1;
    int no2;
    void sum(){
        no1 = 10;
        no2 = 20;
        System.out.println("Addition : " + (no1 + no2));
    }

    void sum(int no1){
        this.no1 = no1; 
        System.out.println("Sum with 1 parameters : " + (no1 + no2));   
    }

    void sum(int no1,int no2){
        this.no1 = no1;
        this.no2 = no2;
        System.out.println("Sum with 2 parameters : " + (no1 + no2));
    }
}

class MethodOverloadingDemo{
    public static void main(String[] args){
        Calculation obj = new Calculation();
        obj.sum();
        obj.no2 = 30;
        obj.sum(50);
        obj.sum(10,20);
    }
}

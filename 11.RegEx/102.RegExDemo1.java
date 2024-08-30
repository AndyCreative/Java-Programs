class Test{
    int i,j;
    Test(){}
    Test (int i,int j){
        this.i = i;
        this.j = j;
    }
    void Calc (int i,int j){
        i *= 2;
        j /= 2;
        System.out.println("Inside Calc : " + i + " " + j);
    }
    void Calc (Test p){
        i *= 2;
        j /= 2;
        System.out.println("Inside Calc : " + p.i + " " + p.j);
    }
}

class TestDemo {
    public static void main(String[] args) {
        Test t = new Test();
        int i = 20 , j = 30;
        System.out.println("\nPass by value");
        System.out.println("Before Calling : " + i + " " + j);
        t.Calc(i, j);
        System.out.println("After Calling : " + i + " " + j);

        Test t1 = new Test(10,20);
        System.out.println("\nPass by reference");
        System.out.println("Before Calling : " + t1.i + " " + t1.j);
        t1.Calc(t1);
        System.out.println("After Calling : " + t1.i + " " + t1.j);
    }    
}

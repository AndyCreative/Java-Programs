abstract class RBI{
    void display(){
        System.out.println("Simple Class");
    }
    abstract double getRate();
    abstract String getName();
}

class AXIS extends RBI{
    double getRate(){
        return 8.9;
    }

    String getName() {
        return "Bank Name : Axis";
    }
}

class SBI extends RBI{
    double getRate(){
        return 7.6;
    }

    String getName() {
        return "Bank Name : SBI";
    }
}

class AbstractDemo1{
    public static void main(String[] args) {
        RBI r = new AXIS();
        r.display();
        System.out.println(r.getName());
        r = new SBI();
        r.display();
        System.out.println(r.getName());
    }
}

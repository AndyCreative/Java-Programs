enum Mobile{
    Samsung(10000),Nokia(20000),Vivo(30000);
    int p;
    Mobile(int p){
        this.p = p;
    }
    int showPrice(){
        return p;
    }
}
class EnumDemo {
    public static void main(String[] args) {
        for(Mobile m : Mobile.values()) {
            System.out.println(m + " costs " + m.showPrice() + " rupees");
        }
    }
}

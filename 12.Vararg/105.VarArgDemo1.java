class VarArgsDemo1 {
    void display(Object... oa){
        System.out.println("Var Arg Calls");

        for(Object o : oa){
            System.out.println(o + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        VarArgsDemo1 val = new VarArgsDemo1();
        val.display();
        val.display(10);
        val.display(10,20);
        val.display(10,20,"Atmiya");
    
}
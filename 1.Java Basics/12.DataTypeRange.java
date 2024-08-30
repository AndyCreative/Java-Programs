class DTRange{
    public static void main(String[] args){
        System.out.println("        Min Value          Max Value        BIT         Byte      Type");
        System.out.println("------------------------------------------------------------------------");

       System.out.printf("%20d %20d %8d %8d %8s\n",Byte.MIN_VALUE,Byte.MAX_VALUE,Byte.SIZE,((Byte.SIZE)/8),Byte.TYPE);
        System.out.printf("%20d %20d %8d %8d %8s\n",Integer.MIN_VALUE,Integer.MAX_VALUE,Integer.SIZE,((Integer.SIZE)/8),Integer.TYPE);
        System.out.printf("%20d %20d %8d %8d %8s\n",Long.MIN_VALUE,Long.MAX_VALUE,Long.SIZE,((Long.SIZE)/8),Long.TYPE);
        System.out.printf("%20d %20d %8d %8d %8s\n",Short.MIN_VALUE,Short.MAX_VALUE,Short.SIZE,((Short.SIZE)/8),Short.TYPE);
        System.out.printf("%20e %20e %8d %8d %8s\n",Float.MIN_VALUE,Float.MAX_VALUE,Float.SIZE,((Float.SIZE)/8),Float.TYPE);
        System.out.printf("%20e %20e %8d %8d %8s\n",Double.MIN_VALUE,Double.MAX_VALUE,Double.SIZE,((Double.SIZE)/8),Double.TYPE);

    }
}

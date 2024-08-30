import java.io.*;
class RandomAccessFileDemo{
    public static void main(String[] args) throws Exception{
       RandomAccessFile r = new RandomAccessFile(args[0], "r");
       System.out.println("Length of the file : " + r.length());
       r.seek(6);
       System.out.println("Current File Pointer : " + r.getFilePointer());
       String s;
       while((s = r.readLine()) != null){
            System.out.println(s);
       }
       System.out.println("Current File Pointer : " + r.getFilePointer());
    }
}

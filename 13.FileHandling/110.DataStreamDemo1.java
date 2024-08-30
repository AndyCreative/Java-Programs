import java.io.*;
class DataStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("d:\\demo.txt");
            int i = fis.read();
            System.out.println((char)i);
            fis.close();
        }
        catch(Exception e){
        }
    }    
}

import java.io.*;
class DataStreamExample2 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("d:\\demo.txt");
            int i = 0;
            while((i = fis.read()) != -1){
                System.out.print((char)i);
            }
            fis.close();
        }
        catch(Exception e){}
    }    
}

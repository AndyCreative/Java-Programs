import java.io.*;
class FileOutputStreamDemo {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("d:\\demo.txt");
            fos.write(65);
            fos.close();
            System.out.println("File Write Expression is Successful");
        }
        catch(Exception e){}
    }    
}

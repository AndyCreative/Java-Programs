import java.io.*;
class FileOutputStreamDemo2 {
    public static void main(String[] args) {
        String s = "Welcome to file handling";
        try{
            FileOutputStream fout = new FileOutputStream("d:\\demo.txt");
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("File Write Expression is Successful");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }    
}

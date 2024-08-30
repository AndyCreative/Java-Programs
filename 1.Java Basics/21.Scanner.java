import java.util.Scanner;
class UserInputByScanner{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name =   s.nextLine();

        System.out.println("Your name is : " + name);
    }
}

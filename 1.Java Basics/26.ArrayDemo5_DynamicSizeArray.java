//Dynamic Array Size
import java.util.Scanner;
class ArrayDemo5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many elements you want in array? : ");
        int n = s.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter Number [" + (i+1) + "] : ");
            arr[i] = s.nextInt();
        }

        System.out.println("Print Array");
        for(int i = 0; i<arr.length; i++){
            System.out.println("arr [" + (i) + "] = " + arr[i]);
        } 

        int sum = 0;
        float avg = 0;

        for(int no : arr){
            sum+=no;
        }
        avg = sum/n;
        System.out.println("Sum : "+ sum);
        System.out.println("Avg : "+ avg);
    }
}

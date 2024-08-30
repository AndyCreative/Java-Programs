//Search value from array
import java.util.Scanner;
class ArrayDemo6{
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

        System.out.print("Enter number for search :");
        int no = s.nextInt();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == no){
                System.out.println(no + " Found at " + (i) + " Position");
            }
        }
    }
}

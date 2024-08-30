//Search value from array
import java.util.Scanner;
class ArrayDemo7{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many elements do you want in an array? : ");
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

        int fmax = 0,smax = 0,tmax = 0;

        for(int no : arr){
            if(no > fmax){
                
                tmax = smax; 
                smax = fmax;
                fmax = no; 
            }
            else if(no > smax){
                tmax = smax;
                smax = no;
            }
            else if(no > tmax){
                tmax = no;
            }
        } 
        System.out.println();
        System.out.println("First Max : " + fmax);
        System.out.println("Second Max : " + smax);
        System.out.println("Third Max : " + tmax);
    }
}

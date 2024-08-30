import java.util.Scanner;
class ArrayDemo8{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many elements you want in array? : ");
        int n = s.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter Number [" + (i+1) + "] : ");
            arr[i] = s.nextInt();
        }

        System.out.println("\n : Print Array : ");
        for(int i = 0; i<arr.length; i++){
            System.out.println("arr [" + (i) + "] = " + arr[i]);
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    arr[i] = arr[i]^arr[j];
                    arr[j] = arr[i]^arr[j];
                    arr[i] = arr[i]^arr[j];
                }
            }
        }
        System.out.println("\n : Desc Sorting : ");
        for(int i = 0; i<arr.length; i++){
            System.out.println("arr [" + (i) + "] = " + arr[i] + " ");
        }

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    arr[i] = arr[i]^arr[j];
                    arr[j] = arr[i]^arr[j];
                    arr[i] = arr[i]^arr[j];
                }
            }
        }
        System.out.println("\n : Asc Sorting : ");
        for(int i = 0; i<arr.length; i++){
            System.out.println("arr [" + (i) + "] = " + arr[i] + " ");
        }
    }
}

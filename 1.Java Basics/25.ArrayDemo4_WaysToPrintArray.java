// Ways to print the array
class ArrayDemo4{
    public static void main(String[] args) {
        int arr[] = new int[] {54,56,32,98,65,74,12};

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" "); //Index of Array value
        }
        System.out.println();
        for(int no : arr){
            System.out.print(no + " "); // Access actual value without indexing
        }
    }
}

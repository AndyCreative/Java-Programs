class ArrayDemo9 {
    public static void main(String[] args) {
        int arr[][] = new int[4][3]; //4 Rows, 3 Cols
        int arr2[][] = {
                    {1},
                    {2,3},
                    {4,5,6},
                    {7,8,9,10}
        };
        System.out.println("\nThis shows length of rows : ");
        System.out.println(arr.length + " " + arr2.length);
       
        System.out.println("This shows length of columns : ");
        System.out.println(arr[0].length + " " + arr2[0].length);
        System.out.println(arr[1].length + " " + arr2[1].length);
        System.out.println(arr[2].length + " " + arr2[2].length);
        System.out.println(arr[3].length + " " + arr2[3].length);    
       
        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }    
}

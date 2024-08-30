class ArrayDemo10{
    public static void main(String[] args) {
        int arr[] = new int[10];
        int arr2[][] = new int[4][3];
        int arr3[][][] = new int[3][4][5];
       
        for(int k = 0; k <arr3.length; k++){
            for(int i = 0; i<arr3[k].length; i++){
                for(int j = 0; j<arr3[k][i].length; j++){
                    System.out.print(arr3[k][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

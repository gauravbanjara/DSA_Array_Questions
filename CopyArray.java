class CopyArray{
    public static void main(String...args){
        int arr[] = {5, 3, 6, 7, 8, 1};
        int[] arr1 = new int[arr.length];

        for(int i = 0; i<=arr.length-1; i++){
            arr1[i] = arr[i];
        }

        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
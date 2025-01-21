class ShiftEleOfArrayBackAtOnePosition{
    public static void main(String...args){
        // int arr[] = {6, 8, 3, 9, 4, 7};
        int arr[] = {9, 7, 6, 8, 5};

        int last = arr[arr.length-1];
        for(int i = arr.length-1; i >= 1; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;

        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
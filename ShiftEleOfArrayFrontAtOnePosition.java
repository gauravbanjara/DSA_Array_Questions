class ShiftEleOfArrayFrontAtOnePosition{

    static void LeftShift(int[]arr){
        int first = arr[0];
        for(int i = 0; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
    }
    public static void main(String...args){
        int arr[] = {6, 8, 3, 9, 4, 7};
        // LeftShift(arr);
        LeftShift(arr);
        
        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
} 
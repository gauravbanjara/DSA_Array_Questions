class ReplaceBigEleInTwoArray{
    public static void main(String...args){
        int[]arr = {4, 5, 9, 8, 7};
        int[]arr1 = {6, 8, 3, 2, 4};

        for(int i=0;i<=arr.length-1;i++){
            if(arr1[i] < arr[i]){
                arr1[i] = arr[i];
            }
        }
        for(int i = 0; i<=arr1.length-1; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
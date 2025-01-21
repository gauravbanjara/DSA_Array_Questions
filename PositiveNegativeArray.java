class PositiveNegativeArray{
    public static void main(String...args){
        int arr[] = {-8, 5, 4, -7, 9, 6};

        int j = 0;
        int arr1[] = new int[arr.length];
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] > 0){
                arr1[j] = arr[i]; 
                j++;
            }
        }
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] < 0){
                arr1[j] = arr[i]; 
                j++;
            }
        }
        for(int i = 0; i<=arr.length-1; i++){
            arr[i] = arr1[i];
        }

        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
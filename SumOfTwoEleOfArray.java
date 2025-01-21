class SumOfTwoEleOfArray{
    public static void main(String...args){
        int[]arr = {4, 5, 9, 8, 7};
        int[]arr1 = {2, 6, 7, 5, 9};

        for(int i=0; i<=arr.length-2; i++){
            if(i%2==0)
            arr1[i] = arr[i]+arr[i+1];
            else
            arr1[i] = arr1[i]+arr1[i+1];
        }

        for(int i = 0; i<=arr1.length-1; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
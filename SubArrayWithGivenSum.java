class SubArrayWithGivenSum{

    static void find(int arr[], int target)
    {
        int i = 0 , j = 0, sum = 0;
        while(sum!=target){
            if(sum < target )
                sum  = sum+arr[j++];
            else    
                sum = sum-arr[i++];
        }
        for(int k = i; k <=j-1; k++)
           System.out.print(k+" ");
    }
    public static void main(String...args)
    {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int target = 18;
        find(arr,target);
    }
}

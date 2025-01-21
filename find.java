class find
{
    static void find(int arr[], int target)
    {
        for(int i = 0; i<arr.length; i++)
        {
            int sum = 0;
            for(int j = i; j<arr.length; j++)
            {
                sum = sum + arr[j];
                if(sum == target)
                {
                    for(int k = i; k <=j; k++){
                      System.out.print(k+" "); 
                    }
                }
            }
        }
    }
    public static void main(String...args)
    {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int target = 18;
        find(arr,target);
    }
}
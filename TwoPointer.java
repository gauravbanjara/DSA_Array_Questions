class TwoPointer
{
    static int[] find(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        int a[] = new int[2];
        while(start < end)
        {
            int sum = arr[start] + arr[end];
            if(sum == target)
            {
               a[0] = start;
               a[1] = end ;
               break;
            }
            else if(sum < target)
                start++;
            else
                end--;    
        }
        return a;
    }
    public static void main(String...args)
    {
        int []arr = {1, 2, 4, 7, 6, 11};
        int target = 18;
        int []result =  find(arr,target);
        for(int i=0;i<result.length;i++)
        System.out.print(result[i]+" ");
    }
}
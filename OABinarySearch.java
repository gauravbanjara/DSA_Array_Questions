class OABinarySearch
{
    static int OrderAgnosticBS(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

        boolean IsAsc = true;
        if(arr[start] < arr[end])
               IsAsc = true;
        else
               IsAsc = false;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if (target == arr[mid] )
            return mid;

           if(IsAsc)
           {
                if(target > arr[mid])
                   start = mid + 1;
                else
                   end = mid - 1;
           }
           else
           {
               if(target < arr[mid])
                    start++;
               else
                    end--;
           }   
            
        }
        return -1;
    }
    public static void main(String...args)
    {
        // int[] arr = {-9, -5, 0, 1, 9, 8, 12, 14, 20, 43, 56, 58, 78, 99};
        int[] arr = {99, 85, 72, 66, 50, 48, 39, 32, 20, 15, 6, 2, 1};
        int target = 20;
        System.out.println(OrderAgnosticBS(arr, target));
    }
}
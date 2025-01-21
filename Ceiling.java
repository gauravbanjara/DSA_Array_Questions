class Ceiling
{
    static int Ceiling(int [] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            // EDGE CASE FOR THIS PRIGRAM.
            if(target > arr[end])
            return -1;
            //
            int mid = start + (end - start) / 2;
            // if(target > arr[mid])
            //    start++;
            // else if (target < arr[mid])
            //    end--;
            // else 
            //    return mid;    
            if(target == arr[mid])
                return mid;
            else if(target > arr[mid])
                start++;
            else    
                end--;  
        }
        return start;
    }
    public static void main(String...args)
    {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 16;
        int res = Ceiling(arr,target);
        System.out.println(res); 
    }
}

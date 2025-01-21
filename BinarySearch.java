class BinarySearch
{
    static int binarySearch(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length;
        while(start < end)
        {
            int mid = start + (end - start) / 2;
            
            if(target > arr[mid])
               start++;
            else if (target < arr[mid])
               end--;
            else 
               return mid;      
        }
        return -1;
    }
    public static void main(String...args)
    {
        int[] arr = {-9, -5, 0, 1, 6, 9, 8, 12, 14, 20, 43, 56, 58, 78, 99};
        int target = 43;
        int res = binarySearch(arr,target);
        System.out.println(res); 
    }
}
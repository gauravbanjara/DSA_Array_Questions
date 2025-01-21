class min
{
    static void min(int [] arr)
    {
        int ans = arr[0];
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i] < ans)
            ans = arr[i];
        }
        System.out.println(ans);
    }
    public static void main(String...args)
    {
        int[] arr = {36, 23, 8, 44, 59, 14, 25};
        min(arr);
    }
}
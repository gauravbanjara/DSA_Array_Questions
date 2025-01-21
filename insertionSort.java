class insertionSort
{
    static void insertion(int[] arr)
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = i+1; j > 0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                 else
                   break;
            }
        }
    }
    static void print(int arr[])
    {
            for(int i=0;i<=arr.length-1;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String...args)
    {
        int []arr = {5, 6, 3, 2, 78, 0, 1, 68, 14, 39, 44, 20, 66};
        print(arr);
        System.out.println();
        insertion(arr);
        print(arr);
    }
}
class BubbleSort
{
    static void Bubble(int []arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 1; j < arr.length; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
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
        int arr[] = {66, 99, 55, 3, 5, 14, 52, 23, 15, 45, 1, 0, 153, 98,569};
        print (arr);
        Bubble(arr);
        System.out.println();
        print (arr);
        
    }
}
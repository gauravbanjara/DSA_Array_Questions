class ArrayCopy 
{
    static void max(int[] arr)
    {
        int max = arr[0];
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] > max)
            max = arr[i];
        }
            System.out.print(max);
    }

    static void swap(int [] arr ,int index1 , int index2)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
          
          for(int i = 0; i< arr.length; i++)
               System.out.print(arr[i]+" ");
    }
    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
      for(int i = 0; i< arr.length; i++)
         System.out.print(arr[i]+" ");
    }
    public static void main(String...args)
    {
        int[] arr = {1, 6, 9, 8, 45};
        max(arr);
        System.out.println();
        swap(arr , 1 , 3 );
        System.out.println();
        reverse(arr);
    }
}
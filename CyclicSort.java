class CyclicSort
{
    static void sort(int[]arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
            i++;
        }
    }
    static void print(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String...args)
    {
        int[] arr = {5, 4, 3, 2, 1};
        print(arr);
        sort(arr);
        System.out.println();
        print(arr);
    }
}
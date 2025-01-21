class FindNumberUsingCyclic
{
    static int Sort(int [] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int coorectIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[coorectIndex])
            {
                int temp = arr[i];
                arr[i] = arr[coorectIndex];
                arr[coorectIndex] = temp;
            }
            else  
                i++;
        }
        for(int j = 0; j < arr.length; j++)
        {
            if(arr[j] != j)
            return j;
        }
        return arr.length;
    }
    public static void main(String...args)
    {
        int[] arr = {3, 0, 2, 1};
        int n = Sort(arr);
        System.out.println(n);
    }
}

class searchinrange
{
    static int Search(int[] arr, int target,int index1, int index2)
    {
        if(arr.length == 0)
            return 0;
        for(int i = index1; i <= index2; i++)
        {
            if(arr[i] == target)
            return i;
        }
        return -1;
    }
    public static void main(String...args)
    {
        int[] arr = {5, 6, 9, 7, 2, 12, 66, 47};
        int target = 5;
        int result =  Search(arr, target,2,5);
        System.out.println(result);
    }
}
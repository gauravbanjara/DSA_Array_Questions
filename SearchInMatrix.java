class SearchInMatrix
{
    static int[] Search(int[][] arr, int target)
    {
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                if( arr[row][col]==target)
                // return arr[row][col];      // If we want to return value use this return ;
                return new int[] {row , col}; // If we want to return index then we can use this return ;
            }
        }
       return new int[] {-1 , -1};
    }
    public static void main(String...args)
    {
        int[][] arr = {{5,9,6,},
                       {66,3,45},
                       {4,8,55,72},
                       {12,63,14}};
        int target = 55;
        int[] a = Search(arr,target);
        for(int i=0;i<a.length;i++)
         System.out.print(a[i]+" ");
    }
}
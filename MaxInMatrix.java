class MaxInMatrix
{
    static int Search(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                if(arr[row][col] > max)
                max = arr[row][col];
            }
        }
         return max;
    }
    public static void main(String...args)
    {
        int[][] arr = {{5,9,6,},
                       {66,3,45},
                       {4,8,55,72},
                       {12,63,14}};
        int a = Search(arr);
         System.out.print(a);
    }
}
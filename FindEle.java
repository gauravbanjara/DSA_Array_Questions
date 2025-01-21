class FindEle
{
    static int reverse(int [] arr )
    {
       for(int i = 0; i< arr.length; i++)
       {
           int Lsum = 0, Rsum = 0;
           for(int j = 0; j < i; j++)
            Lsum = Lsum + arr[j];
           
            for(int k = i+1; k < arr.length; k++)
              Rsum = Rsum +arr[k];
           
           if (Lsum == reverseDigit(Rsum))
            return i;
       } 
        return -1;
    }
    static int reverseDigit(int n)
    {
        int rev = 0;
        while ( n > 0)
        {
            int a = n % 10;
            rev = rev * 10 + a;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String...args)
    {
        int arr [] = {50, 5, 7, 3, 6, 4, 9, 2, 5};
        // int []arr = {1, 3, 6, 8, 9, 2};
        System.out.println(reverse(arr));
    }

}
class findNumbers
{
    // static int CountNo1(int n){
    //     return (int)(Math.log10(n))+1;
    // }
    static int CountNo(int n)
    {
        if( n < 0)
            n = n*-1;

        if( n == 0)
            return 1;
        
        int count = 0;
        while(n > 0)
        {
            count ++;
            n = n / 10;
        }
        return count;
    }
    public static void main(String...args)
    {
        int[] arr = {12, 548, 6, 352, 45, 699};
        int a = CountNo(arr);
        System.out.println(a);
        // System.out.println(CountNo(-5865964));
    }
}

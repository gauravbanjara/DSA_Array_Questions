import java.util.*;
class main
{
    static List Reverse(int [] arr, int n , int k)
    {
        List <Integer> list = new ArrayList<>();
        int temp = n / k;
        for(int i = 0; i < temp; i ++)
        {
            for(int j = k-1; j >= 0; j--)
                list.add(arr[i*k+j]);
        }
        for(int i = n-n % k; i < n; i++)
        list.add(arr[i]);

        return list;
    }
    public static void main(String...args)
    {
        int arr[] = {1, 2, 3, 4, 5, 9, 6};
        int n = 7 , k = 3;
        List result = Reverse(arr,n,k);
        System.out.println(result);
    }
}
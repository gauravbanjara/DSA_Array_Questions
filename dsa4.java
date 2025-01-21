import java.util.Arrays;
class dsa4
{
      public static void main(String...args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = 6, k=3;
        int[] arr1 = new int [6];
        for(int i = 0; i<arr.length; i++)
        arr1[(i+k)%n] = arr[i];
        System.out.println(Arrays.toString(arr1));
    }    
}
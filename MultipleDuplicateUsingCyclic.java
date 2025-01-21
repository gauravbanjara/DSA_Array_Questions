import java.util.List;
import java.util.ArrayList;

class MultipleDuplicateUsingCyclic
{
    static List Sort(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex])
            {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else 
                i++;
        }
       List<Integer> list = new ArrayList<>();
        for(int j = 0; j < arr.length; j++)
        {
            if( arr[j] != j+1)
            list.add(arr[j]);
        }
        return list;
    }
    public static void main(String...args)
    {
        int arr[] = {1, 2, 9, 6, 2, 3, 6, 5, 8};
        List<Integer> n = Sort(arr);
        System.out.println(n);
    }
}
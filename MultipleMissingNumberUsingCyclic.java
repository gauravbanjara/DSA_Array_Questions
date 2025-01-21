import java.util.List;
import java.util.ArrayList;

class MultipleMissingNumberUsingCyclic
{
    static List<Integer> Sort(int [] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int coorectIndex = arr[i]-1;
            if(arr[i] != arr[coorectIndex])
            {
                int temp = arr[i];
                arr[i] = arr[coorectIndex];
                arr[coorectIndex] = temp;
            }
            else  
                i++;
        }
        List<Integer> list = new ArrayList<>();
        for(int j = 0; j < arr.length; j++)
        {
            if( arr[j] != j+1)
            list.add(j+1);
        }
        return list;
    }
    public static void main(String...args)
    {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer>n = Sort(arr);
        System.out.println(n);
    }
}
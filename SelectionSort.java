import java.io.*; 
public class SelectionSort 
{ 
    static void SelectionSort(int arr[]) 
    { 
        for (int i = 0; i < arr.length-1; i++) 
        {
            int k = i; 
            for (int j = i+1; j < arr.length; j++) 
                if (arr[j] < arr[k]) 
                    k = j;

                  int temp = arr[k]; 
                  arr[k]   = arr[i]; 
                  arr[i]   = temp; 
        } 
    } 
    static void printArray(int arr[]) 
    { 
        for (int i=0; i < arr.length; ++i) 
            System.out.print(arr[i]+" "); 
    } 
    public static void main(String args[]) 
    { 
        int arr[] = {95, 25, 32, 8, 45, -5, -9, 62};
        printArray(arr); 
        SelectionSort(arr); 
        System.out.println();
        printArray(arr); 
    } 
} 
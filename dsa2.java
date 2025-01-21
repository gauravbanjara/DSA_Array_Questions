class dsa2
{
    static int LinearSearch(int[] arr , int target)
    {
        if( arr.length == 0)
            return -1;
           
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
             return i;       // this is used if want to return the index.
           // return arr[i]; // this is used if we want to return the value.
        }
        return -1;
    }
    public static void main(String...args)
    {
        int [] arr = {12, 69, 3, 8, 96, 42, 13, 71, 53, 49};
        int target = 53;
        int a = LinearSearch(arr,target);
        System.out.println(a);
    } 
}
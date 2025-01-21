class CountEle
{
    static int Count(int n)
    {
        int count=0;
        while(n > 0)
        { 
            count++;
            n = n / 10;
        }
            return count;
    }    
    static int replace(int[] arr)
    {
            int count = 0;
            for(int i=0;i<=arr.length-1;i++)
            {       
                arr[i]=Count(arr[i]);
                if(arr[i] % 2 == 0)
                count ++;
            }
                return count;
    }
    static void print(int[] arr)
    {
            for(int i=0;i<=arr.length-1;i++)
                System.out.print(arr[i]+" ");
    }  
    public static void main(String...args)
    {
            int arr[]={145,71,259,75,458, 65, 8564, 88};
            print(arr);
            System.out.println();
            int s = replace(arr);
            System.out.println("Even no. present int array are :");                      
            System.out.print(s);
            System.out.println();

            System.out.println("Total elements are");                   
            print(arr);
    }    
}

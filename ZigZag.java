class ZigZag{
    public static void main(String...args){
        //   output => 3 7 4 8 2 6 1 ;
        int []arr = {4, 3, 7, 8, 6, 2, 1, 9, 23};
        int l = arr.length;
        boolean ele = true;
        for(int i = 0; i < l-1; i++)
        {
            if(ele)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i]   = arr[i+1];
                    arr[i+1] = temp;
                }
            }    
            else
            {
                if(arr[i] < arr[i+1])
                {
                    int temp = arr[i];
                    arr[i]   = arr[i+1];
                    arr[i+1] = temp;
                }
           }
           ele =! ele;
        }
        for(int j=0; j < l;j++)
        System.out.print(arr[j]+" ");
    }
}
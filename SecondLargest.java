class SecondLargest{
    public static void main(String...args){
    int[] arr = {8, 6, 9, 5, 15, 45, 4, 2};
    int max1 = 0, max2 = 0;           
    for(int i=0; i<=arr.length-1; i++){
        if(arr[i] > max1){
            max2 = max1;
            max1 = arr[i];
        }
        if(arr[i] > max1 && max2 < arr[i])
            max2 = arr[i];
    }
    System.out.println(max2);
  }
}
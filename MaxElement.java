class MaxElement{
    public static void main(String...args){
        int arr[] = {6, 9, 2, 4, 8, 4, 12};

        int max = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
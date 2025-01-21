class array{
    public static void main(String...args){
        int []arr={12, 23, 6, 41, 25, 36};
        int sum=0;
        int sum1 =0;
        // int l = arr.length-1;
        for(int i = 0; i < arr.length/2; i++)
        {
            sum = sum+arr[i];
        }
        for(int j = arr.length / 2 ; j < arr.length; j++ ){
            sum1= sum1+arr[j];
        }
        System.out.println(sum +" "+ sum1);
    }
}
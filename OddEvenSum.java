class OddEvenSum{
    public static void main(String...args){
        int arr[] = {10, 20, 5, 4, 3};

        int Osum = 0;
        int Esum = 0;

        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] % 2== 0){
                Esum = Esum + arr[i];
            }
            else{
                Osum = Osum + arr[i];
            }
        }
        System.out.println(Osum*Esum);
    }
}
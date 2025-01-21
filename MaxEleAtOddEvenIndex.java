class MaxEleAtOddEvenIndex{
    public static void main(String...args){
        int arr[] = {4, 3, 5, 8, 7, 6};
        int Omax = Integer.MIN_VALUE;
        int Emax = Integer.MIN_VALUE;

        for(int i=0; i<=arr.length-1; i++){
            if(i % 2 == 0){
                if(arr[i] > Emax)
                Emax = arr[i];
            }
            else{
                if(arr[i] > Omax)
                Omax = arr[i];
            }
        }
        System.out.println(Emax);
        System.out.println(Omax);
        System.out.println(Omax+Emax);
    }
}
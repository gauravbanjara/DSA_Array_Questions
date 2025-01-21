class PosNegSum{
    public static void main(String...args){
        int arr[]={10,20,-5,4,-3,-15,8,7};

        int Psum=0;
        int Nsum=0;

        for(int i =0; i<=arr.length-1; i++){
            if(arr[i] > 0){
                Psum = Psum+arr[i];
            }
            else{
                Nsum = Nsum+arr[i];
            }
        }
        System.out.println(Psum * Nsum*-1);
    }
}
class CummulativeSum{

    static void findSum(int []arr){

        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i]+arr[i-1];
        }
        
        for(int i=0; i<=arr.length-1; i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String...args){
        int []arr= 4};
        findSum(arr);
    }
}{1, 2, 3, 
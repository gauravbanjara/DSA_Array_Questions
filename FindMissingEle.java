class FindMissingEle{
    static void FindEle(int arr[]){
        int j;
        for(int i=1; i<=15; i++){
            for(j=0; j<=arr.length-1; j++){
                if(arr[j] == i)
                    break;
            }
            if(j == arr.length){
            System.out.println(i);
             }
        } 
    }
    public static void main(String...args){
        int arr[]={1, 2, 3, 6, 5, 9, 8, 10, 13, 14, 15};
        FindEle(arr);
    }
}
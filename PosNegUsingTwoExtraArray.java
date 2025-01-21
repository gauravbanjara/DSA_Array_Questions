class PosNegUsingTwoExtraArray{
    public static void main(String...args){
        int arr[] = {-8, 5, 4, -7, 9, 6};
        int pos[] = new int[arr.length];
        int neg[] = new int[arr.length];


        int p =0, n = 0;
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] > 0){
                pos[p++] = arr[i];
            }
            else{
                neg[n++] = arr[i];
            }
        }

        int j = 0;
        for(int i = 0; i< p; i++){
            arr[j++] = pos[i];
        }

        for(int i = 0; i< n; i++){
            arr[j++] = neg[i];
        }

        // for(int i = 0; i<=pos.length-1; i++){
        //     System.out.print(pos[i]+" ");
        // }

        // System.out.println();

        // for(int i = 0; i<=neg.length-1; i++){
        //     System.out.print(neg[i]+" ");
        // }

        //  System.out.println();

        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
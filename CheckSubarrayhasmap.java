import java.util.*;
class CheckSubarrayhasmap{
    static boolean check(int[] arr1, int []arr2){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<=arr1.length-1; i++){
            if(hm.containsKey(arr1[i])){
                hm.put(arr1[i], hm.get(arr1[i])+1);
            }
            else
                hm.put(arr1[i],1);
        }
        for(int i=0; i<=arr2.length-1; i++){
            if(hm.containsKey(arr2[i])){
                if(hm.get(arr2[i])==1)
                    hm.remove(arr2[i]);
                else
                    hm.put(arr1[i],hm.get(arr2[i])-1);
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String...args){
        int[] arr1 = {11, 1, 3, 5, 9, 45};
        int[] arr2 = {11, 1, 5, 45};
        System.out.println(check(arr1,arr2));
    }
}
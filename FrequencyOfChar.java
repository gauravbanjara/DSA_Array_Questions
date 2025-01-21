import java.util.*;
class FrequencyOfChar{

    static void FrequencyOfChar(String str){
        HashMap <Character,Integer> hm = new HashMap<>();
        for(int i=1; i<str.length(); i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else
                hm.put(ch,1);
       }
       for(Map.Entry <Character, Integer> entry : hm.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());
    }
    public static void main(String...args){
        String str = "gauravjadhav";
        FrequencyOfChar(str);
    }
}

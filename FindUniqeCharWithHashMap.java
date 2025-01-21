import java.util.*;
class FindUniqeCharWithHashMap{

    static char findUniqueChar(String str){
        HashMap <Character, Integer> hm = new HashMap <> ();
        for(int i = 1; i<str.length(); i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else    
                hm.put(ch,1);
        }
        char ch=' ';
        for(Map.Entry <Character, Integer> e : hm.entrySet()){
            if(e.getValue() == 1){
                ch = e.getKey();
            }
        }

        return ch;
    }
    public static void main(String...args){
        String str = "Jadhav Gaurav";
        System.out.println(findUniqueChar(str));
    }
}
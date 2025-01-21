class Pallindrome
{
    // static boolean isPallindrome(String str)
    // {
    //     str = str.toLowerCase();
    //     String rev = "";
    //     for(int i = str.length()-1; i >= 0; i--)
    //     {
    //         rev = rev + str.charAt(i);
    //     }
    //     if(str.equals(rev))
    //        return true;

    //     return false;        
    // } 
    // public static void main(String...args)
    // {
    //     String str = "ABccBA";
    //    System.out.println(isPallindrome(str));
    // }

    public static void main(String...args){
        String str = "abCba";
        String rev = "";

        String s = str.toLowerCase();
        for(int i = str.length()-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        if(s.equals(rev))
        System.out.print("pallindrome");
        else 
        System.out.print("Not a pallindrome");
    }














}
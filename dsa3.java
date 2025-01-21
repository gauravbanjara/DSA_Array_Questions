class dsa3
{
    static boolean LinearSearch(String s, char target)
    {
        // Edge CASE OF THIS CODE.
        if(s.length()==0)
        return false;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);  // THIS IS USED TO TAKE CHARACTER FROM A STRING ONE BY ONE.
            if(ch == target)
            return true;
        }
        return false;
    }
    public static void main(String...args)
    {
        String s = "Gaurav";
        char target = 'u';
        System.out.println(LinearSearch(s,target));
    }
}
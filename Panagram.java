class Panagram
{
    static boolean check(String s)
    {
        s = s.toLowerCase();
        boolean []b = new boolean[26];
        for(int i=0; i  < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                int x = ch - 'a';
                b[x] = true;
            }
        }
        for(boolean present : b)
        {
            if(!present)
                return false;
        }
        return true;
              
    }
    public static void main(String...args)
    {
        // String s = "The five boxing wizards jump quickly";
        String s = " my name is Jadhav Gaurav ";
        boolean result = check(s);
        if(result)
        System.out.println(" Alphabets are present");
        else
        System.out.println(" Alphabets are not present");
    }
}
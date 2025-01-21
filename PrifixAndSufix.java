class PrifixAndSufix
{
    static String check(String s)
    {
        String s1 = "";
        for(int i =0; i < s.length(); i++)
        {
            String pri = s.substring(0,i);
            String suf = s.substring(s.length() - i);
            if(pri.equals(suf))
                s1 = pri;
        }
        return s1;
    }
    public static void main(String...args)
    {
        String  s = "asasbsasa";
        String str = check(s);
        System.out.println(str);
    }
}
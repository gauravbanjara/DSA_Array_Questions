class StringReverse
{
    static void reverse(String s)
    {
        String[] str = s.split(" ");
        int l = str.length;
        for(int i = 0; i < l/2; i++)
        {
            String a = str[i];
            str[i] = str[l-i-1];
            str[l-i-1] = a;
        }
        for(String word : str)
        System.out.print(word+" ");
        // String s1 = String.join(" ",str);
        // System.out.println(s1);
    }
    public static void main(String...args)
    {
        String s = "java is statically typed language";
        reverse(s);
    }
}
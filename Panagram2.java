class Panagram2
{
 public static void Containswtters(String s)
 {
    s = s.toLowerCase();
    boolean b = true;
    for(char ch ='a'; ch <='z'; ch++)
    {
        if(!s.contains(String.valueOf(ch)))
        {
            b = false;
            break;
        }
    }
    if(b)
    System.out.println("Panagram");
    else
    System.out.println("Not a Panagram");
 }
     public static void main(String...args)
    {
        // String s = "The five boxing wizards jump quickly";
        String s = " abcd efg hijkl mnop rstuv wxyz";
        Containswtters( s);
    }
}

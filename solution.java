class solution
{
    static int isPalindrome(String A) {
       
        A = A.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
       
        for(int i = 0; i < A.length()-1 / 2; i++){
           
            if(A.charAt(i) != A.charAt(A.length() -1 - i))
                return 0;
        }
        return 1;
   }
   public static void main(String...args)
   {
    String A = "A man, a plan, a canal: Panama";
    System.out.println(isPalindrome(A));
   }
}
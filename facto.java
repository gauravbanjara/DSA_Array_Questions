import java.util.Scanner;
class facto
{
      static int facto(int n)
      {
          int result=1;
          for(int i=2;i<=n;i++)
          {
              result=result*i;
          }
          return result;
      }   
      public static void main(String...args)
      {
          Scanner s = new Scanner(System.in);
          System.out.print("Enter the No : ");
          int n=s.nextInt();
          System.out.print("The factorial of nubmer you entered is: ");
          System.out.println(facto(n));
      }
}
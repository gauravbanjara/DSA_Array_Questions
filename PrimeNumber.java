import java.util.Scanner;
class PrimeNumber
{
    static String checkprime(int n)
    {
        int count = 0;
        // Edge case
        if(n < 2)
            return "Not a Prime Number";
            
        for(int i = 2; i <= n; i++)
        {
            if(n % i == 0)
                count++;
        }
       return (count == 1)?"Prime number":"Not a Prime Number";
    }
    public static void main(String...args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        int n = sc.nextInt();
        System.out.println(checkprime(n));
    }
}
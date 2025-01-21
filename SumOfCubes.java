import java.util.Scanner;
import java.lang.Math;
class SumOfCubes
{
    static int sumofcube(int m, int n)
    {
        if(m > n)
        return 0;
        int sum = 0;
        for(int i = m; i <= n; i++)
        {
            sum = sum +(int) Math.pow(i,3);
        }
        return sum;
    }
    public static void main(String...args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first No: ");
        int m = sc.nextInt();
        System.out.print("Enter second No: ");
        int n = sc.nextInt();
        System.out.println(sumofcube(m,n));
    }

}
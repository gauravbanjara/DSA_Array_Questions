import java.util.Scanner;
class Fibbo
{
     // with recursion
    static int fibbo1(int n){
        if(n < 2)
        return n;
        return fibbo1 (n-1) + fibbo1(n-2);
    }
    static void fibbo(int n){
        int a = 0;
        int b = 1;
        for(int i = 0; i <= n; i++)
        {
            // System.out.print(a+" ");
            int temp = a + b;
            b = a;
            a = temp;            
        } 
        System.out.print(a+" ");
    }
    public static void main(String...args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        // fibbo(n);
        fibbo1(n);
        for(int i = 0; i <= n; i++)
            System.out.print(fibbo1(i)+" ");
    }
}
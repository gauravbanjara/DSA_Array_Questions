// import java.util.Scanner;
class Armstrong
{
    public static void main(String...args){
        int n = 153;
        int num = n;
        int sum = 0;
        while(num > 0){

            int a = num %10;
            sum = sum + a*a*a;
            num = num /10;
        }
        if(sum == n)
            System.out.println("Armstrong number");
        else
             System.out.println("Not an Armstrong number");
    }
}


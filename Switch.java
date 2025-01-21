import java.util.Scanner;
class Switch
{
    public static void main(String...args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day : ");
        int day = sc.nextInt();
        switch(day){
            case 1:
               System.out.println("Monday");
               break;
            case 2:
               System.out.println("Tuesday");
               break;
            case 3:
                System.out.println("Wednsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                 System.out.println("Friday");
                 break;
            case 6:
                 System.out.println("Saturday");
                 break;
            case 7:
                  System.out.println("Sunday");
                  break;
            default:  
                 System.out.println("Enter valid number");

                  // This is Advanced Switch
            // case 1 -> System.out.println("Monday");
            // case 2 -> System.out.println("Tuesday");
            // case 3 -> System.out.println("Wednsday");
            // case 4 -> System.out.println("Thursday");
            // case 5 -> System.out.println("Friday");
            // case 6 -> System.out.println("Saturday");
            // case 7 -> System.out.println("Sunday");
            // default -> System.out.println("Enter valid number");
        }
    }
}
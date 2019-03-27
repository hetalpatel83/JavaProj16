import java.util.Scanner;

public class WeekDayNumber15
{
    //input any number, the print Day name of the week
    public static void main(String args[])
    {
        //defining obect in main method
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int weekday =scanner.nextInt();
        //using If else-if ladder
        if (weekday == 1)
        {
            System.out.println("Monday");
        }
        else if(weekday == 2)
        {
            System.out.println("Tuesday");
        }
        else if(weekday == 3)
        {
            System.out.println("Wednesday");
        }
        else if(weekday == 4)
        {
            System.out.println("Thursday");
        }
        else if(weekday == 5)
        {
            System.out.println("Friday");
        }
        else if(weekday == 6)
        {
            System.out.println("Saturday");
        }
        else if(weekday == 7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid Please enter week number between 1-7.");
        }

    }
}

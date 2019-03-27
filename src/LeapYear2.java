import java.util.Scanner;

public class LeapYear2
{
    //input a year and find out if it is leap year
    //using main method
    public static void main(String[] args){
        //defining object and integer year
        Scanner scanner = new Scanner (System.in);
        int year = 2016;

    //leap year is divisible by 4
        if(year % 4 == 0 )
     System.out.println(year + " is a leap year");
        else
     System.out.println(year + " is not a leap year");

    }

}

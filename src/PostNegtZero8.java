import java.util.Scanner;

public class PostNegtZero8
{
    //find out number is positive, negative or zero
    //main method and defining object
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //print out enter number
        System.out.println("Enter number");
        int number = scanner.nextInt();

        //using If else-if ladder statement
        // if number is less than 0
        if (number < 0)
            System.out.println(number + " is a negative number");

            // if number is greater than 0
        else if ( number > 0)
            System.out.println(number + " is a positive number");

            // if number is zero
        else
            System.out.println(number + " is 0");
    }

}

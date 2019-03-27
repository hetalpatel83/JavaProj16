import java.util.Scanner;

public class AgeForVote11
{
    //program to allow the user to input his/her age and eligible to vote.
    // A person who is eligible to vote must be older than or equal to 18 years old.
    public static void main(String args[])
    {
        //in main method defining object and integer
    Scanner scanner =new Scanner(System.in);
    int age;
    System.out.println("Enter Age");
    age=scanner.nextInt();
    //using if else statement
    if(age>=18)
    System.out.println(" You are eligible to vote. ");
    else
    System.out.println(" You are not eligible. ");


    }



    }




import java.util.Scanner;

public class OddEven1 {
    // here is find out its odd or even number using ternary operator (? :)
    //main method
    public static void main(String[] args) {
      //defining a object
        Scanner scanner = new Scanner(System.in);
      //entered integer number
        System.out.print("Enter a number first integer number: ");
        int a = scanner.nextInt();
     //num is divisible by 2 "even" is returned Else "odd" is returned.
         String evenOdd = (a % 2 == 0) ? "even" : "odd";
         System.out.println(a + " is " + evenOdd);

        System.out.println("Enter a number second integer number: ");
        int b = scanner.nextInt();
        String Oddeven = (b % 2 == 0) ? "even" : "odd";
        System.out.println(b + " is " + Oddeven);

    }

    }







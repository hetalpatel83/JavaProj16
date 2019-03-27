import java.util.Scanner;

//input enter any two number and ask user to enter their symbol (+, -, /, *)
public class Symbol13 {
    //main method in class
    public static void main(String args[]) {
   //defining object
        Scanner scanner = new Scanner(System.in);

   //print enter number and symbol
        // defining variable
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter symbol ( +, -, * or /): ");
        char symbol = scanner.next().charAt(0);

        //find addition, subtraction, multiplication and division according to their symbol
        //using If else-if ladder
        if (symbol == '+')
        {
            System.out.println("Addition "+number1+" + "+number2+": " + (number1+number2));
        }else if (symbol =='-')
        {
            System.out.println("Subtraction "+number1+" - "+number2+": " + (number1-number2));
        }
        else if (symbol =='*')
        {
            System.out.println("Multiplication "+number1+" * "+number2+": " + (number1*number2));
        }
        else if (symbol =='/')
        {
            System.out.println("Division "+number1+" / "+number2+": " + (number1/number2));
        }
        else
        {
            System.out.println("Invalid symbol");
        }
    }

}
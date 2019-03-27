import java.util.Scanner;

public class UpperLowerCase12
{
    //Input any alphabet in uppercase and print it in lowercase
    public static void main(String args[])
    { //defining object in main method
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter ALPHABETS UPPERCASE : ");
       //using string in scanner
        String alphabet =scanner.nextLine();
        String word =alphabet.toLowerCase();
        System.out.println("alphabet in Lowercase : "+ word);



    }
}

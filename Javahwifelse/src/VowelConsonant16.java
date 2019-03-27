import java.util.Scanner;


//user to provide a single character from the alphabet
public class VowelConsonant16
{       //main method
    public static void main(String[ ] arg) {
        //defining object
        Scanner scanner = new Scanner(System.in);
        //print enter an alphabet
        System.out.println("Enter an alphabet : ");
        //data type character
        char alpha = scanner.next().charAt(0);
        //alphabet vowel & consonant in upper and lowercase
        //using operators in if else method
        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' || alpha == 'y' || alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U' || alpha == 'Y') {
            System.out.println("An alphabet " + alpha + " is Vowel");
        } else if ((alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z')) {
            System.out.println("An alphabet " + alpha + " is Consonant");
        }
        else {
            System.out.println("Not an alphabet");
        }
        }

}

import java.util.Scanner;

public class InterchangeValue5
{
    //input any two numbers and then print their interchanged value
    //in main method defining object
        public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
    // put integer a and b value
        int a = 15;
        int b = 10;

    // print their interchange value
        System.out.println("Before interchange : a, b = "+a+", "+ + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After interchange : a, b = "+a+", "+ + b);

    }

}

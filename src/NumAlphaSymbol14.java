import java.util.Scanner;

public class NumAlphaSymbol14
{
    //Enter any value and the find out if it is number or an alphabet or symbol
    public static void main(String args[])

    {    //defining object in main method
        //Convert char into int (type casting)
        char input;
        int temp;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter character");
        input=scanner.next().charAt(0);
        temp=(int) input;

        if(temp>=65 && temp<=90)
        {
            System.out.println(input+" is a Upper Case Alphabet");
        }
        else if(temp>=97 && temp<=122)
        {
            System.out.println(input+" is a lower case alphabet");
        }
        else if(temp>=48 && temp<=57)
        {
            System.out.println(input+" is a Digit");
        }
        else if((temp>=32 && temp<=47) || (temp>=58 && temp<=64) || (temp>=91 && temp<=96) || (temp>=123 && temp<=126))
        {
            System.out.println(input+ " It's a Symbol");
        }


    }
}

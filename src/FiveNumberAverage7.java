import java.util.Scanner;

public class FiveNumberAverage7
{
    //finding five numbers and average of five numbers
    //using main method
    public static void main(String args[])
        {
      int a,b,c,d,e,avg;
     //defining object using scanner
      Scanner scanner = new Scanner(System.in);

     //print value of numbers and average
     System.out.println("Enter the value of a");
     a=scanner.nextInt();

     System.out.println("Enter the value of b");
     b=scanner.nextInt();

     System.out.println("Enter the value of c");
     c=scanner.nextInt();

     System.out.println("Enter the value of d");
     d=scanner.nextInt();

     System.out.println("Enter the value of e");
     e=scanner.nextInt();

     System.out.println("The average of five numbers is : ");
     int total=a+b+c+d+e;
     avg= total/5;
     System.out.println(avg);
        }
}

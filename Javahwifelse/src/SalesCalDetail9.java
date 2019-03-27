import java.util.Scanner;

public class SalesCalDetail9
{
    //input sales id, seller's name, sales amount, salary basic and then find this sales commission
    public static void main(String[] args)
    {
       //defining object,integer and string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sales ID");
        int id = scanner.nextInt();

        System.out.println("Seller's Name");
        String name = scanner.next();

        System.out.println("Sales Amount");
        int amount = scanner.nextInt();

        System.out.println("Basic Salary");
        int basicsalary = scanner.nextInt();

        //using If else-if ladder
        System.out.println("Commission: ");
        if(amount >=50000 && amount>30000)
        {
            System.out.println(amount*35/100);
        }
        else if(amount>=30000 && amount>20000)
        {
            System.out.println(amount*20/100);
        }
        else if(amount>=20000 && amount>10000)
        {
            System.out.println(amount*10/100);
        }
        else if(amount>=10000 && amount>10000)
        {
            System.out.println(amount*5/100);
        }
      else
          {
            System.out.println(amount*2/100);
          }





    }
}

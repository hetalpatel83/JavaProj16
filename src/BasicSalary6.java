import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class BasicSalary6
{
//to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary

    public static void main(String[]args)
    {
        //defining object,int and double in main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID");
        int id = scanner.nextInt();

        System.out.println("Name");
        String name = scanner.next();

        System.out.println(" Emp Salary");
        int Salary = scanner.nextInt();

       double HRA = (Salary * 10) / 100;
        System.out.println( " House Rent 10 % of Basic Salary : " + HRA);

        double DA = (Salary * 8) / 100;
        System.out.println("DA"+DA );

        double TA = (Salary * 9)/100;
        System.out.println("TA" + TA);

        double PF = (Salary * 20)/100;
        System.out.println("PF" + PF);


double grosssalary = Salary + HRA + DA + TA - PF;
        System.out.println(" Gross Salary " +grosssalary);

        


        
    }

}

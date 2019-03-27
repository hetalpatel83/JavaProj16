import java.util.Scanner;

public class Result3 {
    //write a program- student name,number,3 subject marks,total percentage
    // and pass or fail according to percentage and grade.
    public static void main(String args[]) {
        //in main method defining object
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Student name");
        String name = scanner.nextLine();

        //number defining under integer
        System.out.println(" rollnumber ");
        int rollnumber = scanner.nextInt();

        System.out.println("maths");
        int maths = scanner.nextInt();

        System.out.println("science");
        int science = scanner.nextInt();

        System.out.println("english");
        int english = scanner.nextInt();

        //using double variable for total and percentage
        double add = (maths + science + english);
        System.out.println(" Total Marks" + add);

        double percentage = (add) * 100 / 300;
        System.out.println(" Total Percentage" + percentage);

        //using If else-if ladder
        if (percentage >= 35) {
            System.out.println("student pass");

            if (percentage >= 80) {
                System.out.println("A+");
            } else if (percentage >= 60) {
                System.out.println("A");
            } else if (percentage >= 50) {
                System.out.println("B");
            } else if (percentage >= 35) {
                System.out.println("C");
            }

        } else {
            System.out.println("student fail");
        }
    }
    }


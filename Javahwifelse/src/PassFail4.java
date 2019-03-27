import java.util.Scanner;

public class PassFail4 {
//pass or fails on the basis of..student needs to pass all the subjects
    //using main method and defining object
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
       //using string
        System.out.println(" Student name");
        String name = scanner.nextLine();
       //using integer to describe for roll number and subject marks
        System.out.println(" rollnumber ");
        int rollnumber = scanner.nextInt();

        System.out.println("maths");
        int maths = scanner.nextInt();

        System.out.println("science");
        int science = scanner.nextInt();

        System.out.println("english");
        int english = scanner.nextInt();
        // using operators in if else
        if (maths <= 35 || +science <= 35 || +english <= 35) {
            System.out.println("fail");
        } else {
            System.out.println("pass");
        }


    }

}


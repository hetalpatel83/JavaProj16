import java.util.Scanner;

public class CitynameAtoF10 {
    //input any number and fid our if it is positive,negative or zero
    public static void main(String[] args) {
        //defining object in main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city name start with alphabet : ");
        String name = scanner.next();

        //using If else-if ladder
        if (name.equals("a")) {
            System.out.println(" Amsterdam");
        }
        else if (name.equals("b")) {
            System.out.println("Budapest");
        }
        else if (name.equals("c")) {
            System.out.println("Cambridge");
        }
        else if (name.equals("d")) {
            System.out.println("Derby");
        }
        else if (name.equals("e")) {
            System.out.println("Edinburgh");
        }
        else if (name.equals("f")) {
            System.out.println("Fort Lauderdale");
        }
        else {
            System.out.println("alphabet is invalid");
        }


    }




}
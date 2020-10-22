package Loop;
import java.net.SocketOption;
import java.util.Scanner;
public class B_IncrementWhile {

    /*

    public static void main(String[] args) {
        int glassOfWater = 2;
        System.out.println("\n");
        while(glassOfWater<=100) {
            System.out.println("Sir you have drank " + (glassOfWater-1) + " glass of water");
            glassOfWater+=1;
        }
        System.out.println("You last glass is : " + (glassOfWater-1));
    }

    }
     */

    int userChoice;
    public void ninja(){
        System.out.println("\nPress 1 to add (+)");
        System.out.println("Press 2 to sub (-)");
        System.out.println("Press 3 to multiply (*)");
        System.out.println("Press 4 to division: (/)");
        System.out.println("Press 5 to modular: (%)");
        System.out.println("Press 6 to exit: <->");

        Scanner option = new Scanner(System.in);
        System.out.print("\nPlease enter your choice: ");
        userChoice = option.nextInt();

        int n1, n2, s;
        switch (userChoice) {
            case 1:
                System.out.println("You have selected for addition -> ");
                System.out.print("Enter the first number: ");
                n1 = option.nextInt();
                System.out.print("Enter the second number: ");
                n2 = option.nextInt();
                s = n1 + n2;
                System.out.println("The addition of " + n1 + " + " + n2 + " is " + s);
                break;

            case 2:
                System.out.println("You have selected for subtraction -> ");
                System.out.print("Enter the first number: ");
                n1 = option.nextInt();
                System.out.print("Enter the second number: ");
                n2 = option.nextInt();
                s = n1 - n2;
                System.out.println("The subtraction of " + n1 + " - " + n2 + " is " + s);
                break;

            case 3:
                System.out.println("You have selected for multiplication -> ");
                System.out.print("Enter the first number: ");
                n1 = option.nextInt();
                System.out.print("Enter the second number: ");
                n2 = option.nextInt();
                s = n1 * n2;
                System.out.println("The multiplication of " + n1 + " * " + n2 + " is " + s);
                break;

            case 4:
                System.out.println("You have selected for Division -> ");
                System.out.print("Enter the first number: ");
                n1 = option.nextInt();
                System.out.print("Enter the second number: ");
                n2 = option.nextInt();
                s = n1 / n2;
                System.out.println("\nThe division of " + n1 + " / " + n2 + " is " + s);
                break;

            case 5:
                System.out.println("You have selected for Modular -> ");
                System.out.print("Enter the first number: ");
                n1 = option.nextInt();
                System.out.print("Enter the second number: ");
                n2 = option.nextInt();
                s = n1 % n2;
                System.out.println("\nThe modular of " + n1 + " % " + n2 + " is " + s);
                break;

            case 6:
                break;

            default:
                System.out.println("Please enter a valid number.");
        }

    }

    public static void main(String[] args) throws InterruptedException {
        B_IncrementWhile operation = new B_IncrementWhile();
        while(operation.userChoice!=6) {
            operation.ninja();
            System.currentTimeMillis();
            System.out.println("Process completed...");
            Thread.sleep(1450);
        }
        System.out.println("Thanks for using our calculator.");
    }
}



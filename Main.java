//Library used for reading user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //double variables used to store user input
        double number1;
        double number2;
        double total;

        //stores the operator
        char operator;

        //Creates a Scanner object
        Scanner input = new Scanner(System.in);

        //boolean variable used to determine when the while loop will end
        boolean status = true;

        /*  This while loop performs the calulations.
            It also allows the user to perform more then one calculations */
        while(status) {
            //get the first number from the user
            System.out.print("Enter Your First Number: ");
            number1 = input.nextDouble();
            
            //get the second number from the user
            System.out.print("Enter Your Second Number:");
            number2 = input.nextDouble();

            //get the operator from the user
            System.out.print("Enter An Operator (+, -, *, /): ");
            operator = input.next().charAt(0);

            //perform the calculation based on the operator and print the result using a switch statement
            switch (operator) {
                case '+':
                    total = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + total);
                    break;
                
                case '-':
                    total = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + total);
                    break;
                
                case '*':
                    total = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + total);
                    break;
                
                case '/':
                    total = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + total);
                    break;
                
                //if the user enters an invalid operator, print an error message.
                default:
                    System.out.println("Error: operator is not valid");
            }

            //prompt the user to see if they want to run the program again.
            System.out.print("Do you want to run the program again? (Y/N): ");
            char answer = input.next().charAt(0);

            //if yes keep the status true
            if(answer == 'Y' || answer == 'y') {
                status = true;
            }
            //if not set the status to false to end the while loop
            else {
                status = false;
                break;
            }
        }
        //close the scanner object to prevent memory leaks.
        input.close();

    }
}
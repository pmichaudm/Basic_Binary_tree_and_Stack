// Philippe Michaud Mathias
// Student ID: 261124425

package Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        app(); // Calls the app method.
    }

    /**
     * This method contains the main logic of the program.
     * It is called from the main method.
     * This method first prints out the welcome message and the available commands.
     * It then takes in commands with the use of the Scanner class inside a while loop.
     */
    public static void app() {
        Scanner scanner = new Scanner(System.in); // Scanner object to take in user input.
        Stack stack = new Stack(); // Stack.Stack object to be used in the program.
        System.out.println("Welcome to Stacks!"); // Welcome message.
        System.out.println("-------------------");
        System.out.println("Here are the available commands:");
        System.out.println();
        System.out.println("Enter (a) to the above question and enter an integer you wish to add to your stack.");
        System.out.println("Enter (+ or *) as an operator to be applied to the last two items added to your stack.");
        System.out.println("Enter (?) if you wish to see everything in your stack printed to the screen.");
        System.out.println("Enter (p) if you wish to remove the last item.");
        System.out.println("Enter (z) if you are done playing with stacks.");
        System.out.println();
        while (true) { // While loop to take in commands.
            System.out.println("Enter your command:");
            String[] input = scanner.nextLine().split(" "); // Takes in the command/input and splits it into an array.
            String command = input[0]; // The first element of the array is the command.
            switch (command) { // Switch statement to check the command.
                case "a": // If the command is "a" then the user wants to add an item to the stack.
                    try {
                        Integer.parseInt(input[1]); // Checks if the second element of the array is an integer.
                    } catch (NumberFormatException e) { // If it is not an integer then it will throw an exception.
                        System.out.println("Invalid input. Please try again and use an integer number.");
                        break;
                    }
                    stack.getList().push(Integer.parseInt(input[1])); // If it is an integer then it will be added to the stack.
                    System.out.println("Your value has been added to the stack!");
                    break;
                case "+": // If the command is "+" then the user wants to add the last two items in the stack.
                    stack.addition(); // The addition method is called.
                    System.out.println("You have added the last two items in your stack and pushed the total: " + stack.getList().getHead().getElement());
                    break;
                case "*": // If the command is "*" then the user wants to multiply the last two items in the stack.
                    stack.multiplication(); // The multiplication method is called.
                    System.out.println("You have multiplied the last two items in your stack and pushed the total: " + stack.getList().getHead().getElement());
                    break;
                case "?": // If the command is "?" then the user wants to see all the items in the stack.
                    System.out.println("Your stack items are: [" + stack.getList() + "]");
                    break;
                case "p": // If the command is "p" then the user wants to remove the last item in the stack.
                    stack.getList().pop();
                    System.out.println("The last item has been removed from your stack.");
                    break;
                case "z": // If the command is "z" then the user wants to exit the program.
                    System.out.println("Thank you for playing with stacks!");
                    System.exit(0);
                    break;
                default: // If the command is not any of the above then it is invalid.
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
        }
    }
}

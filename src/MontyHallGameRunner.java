import java.util.Scanner;

public class MontyHallGameRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Introduction
        System.out.println("\nWelcome to the Monty Hall Game!\n");

        // Explains rules and lets the user pick a door
        System.out.println("There are two goats and a car randomly placed behind doors 1, 2, and 3");
        System.out.print("Where do you think the car is? Enter 1, 2, or 3: ");
        int door = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        // Creates a new game
        MontyHallGame game = new MontyHallGame();

        // Prints out one of the goats
        game.goat1();

        System.out.print("Do you want to switch your guess? Yes or no: ");
        String changes = scan.nextLine();

        if (changes.equalsIgnoreCase("yes") || changes.equalsIgnoreCase("y")) {
            game.switcher();
        }

        System.out.println("\n" + game.win());
    }
}


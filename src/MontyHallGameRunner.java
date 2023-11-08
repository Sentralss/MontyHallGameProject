import java.util.Scanner;
public class MontyHallGameRunner
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        // Introduction
        System.out.println("\nWelcome to the Monty Hall Game!\n");

        // Explains rules and lets user pick door
        System.out.println("There are two goats and a car randomly placed behind doors 1, 2, and 3");
        System.out.print("Where do you think the car is? Enter 1, 2, or 3: ");
        int door = scan.nextInt();

        // Creates new game
        MontyHallGame doornum1 = new MontyHallGame();

        // Prints out one of the goats
        doornum1.goat1();

        String changes = scan.nextLine();
        System.out.print("Do you want to switch your guess? Yes or no: ");
        changes = scan.nextLine();


        if (changes.equals("yes") || changes.equals("Yes") || changes.equals("y")) {
            doornum1.switcher();
        }
        System.out.println();


        System.out.println(doornum1.win());










    }
}

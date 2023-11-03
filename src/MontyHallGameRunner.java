import java.util.Scanner;
public class MontyHallGameRunner
{
    public static void main(String[] args)
    {


        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Monty Hall Game!\n");

        System.out.println("There are two goats and a car randomly placed behind doors 1, 2, and 3");
        System.out.print("Where do you think the car is? Enter 1, 2, or 3: ");
        int door = scan.nextInt();
        MontyHallGame doornum = new MontyHallGame(door);
        System.out.println("One of the goats is behind door number " + doornum.goat1());
        System.out.print("Do you want to switch your guess? Yes or no: ");
        String change = scan.nextLine();
        doornum = new MontyHallGame(door, change);
        System.out.println(doornum.switcher());
        System.out.println(doornum.win());










    }
}

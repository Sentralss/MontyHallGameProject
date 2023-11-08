import java.util.Scanner;
public class MontyHallGameRunner
{
    public static void main(String[] args)
    {


        Scanner scan = new Scanner(System.in);

        System.out.println("\nWelcome to the Monty Hall Game!\n");

        System.out.println("There are two goats and a car randomly placed behind doors 1, 2, and 3");
        System.out.print("Where do you think the car is? Enter 1, 2, or 3: ");
        int door = scan.nextInt();
        MontyHallGame doornum = new MontyHallGame(door);
        System.out.println("One of the goats is behind door number " + doornum.goat1());
        String changes = scan.nextLine();
        System.out.print("Do you want to switch your guess? Yes or no: ");
        changes = scan.nextLine();
        MontyHallGame doornum1 = new MontyHallGame(door, changes);
        System.out.println();
        if(doornum1.change() == true)
        {
            System.out.println("Guess switched from " + door + " to " + doornum1.switcher());
        }
        System.out.println(doornum1.win());










    }
}

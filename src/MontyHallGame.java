import java.util.Scanner;
public class MontyHallGame
{
    private int door;
    private int goatdoor;
    private String change;
    private int cardoor;

    public MontyHallGame()
    {
        cardoor = (int) (Math.random()*3 + 1);
    }

    public void goat1()
    {
        do{
            goatdoor = (int) (Math.random()*3 + 1);
        } while (goatdoor == cardoor || goatdoor == door);

        System.out.println("One of the goats is behind door number " + goatdoor);

    }

    public void switcher() {
        int i;
        for (i = 1; i <= 3; i++) {
            if (i != door && i != goatdoor) {
                door = i;
                break;
            }
        }
        System.out.println("Guess switched from " + door + " to " + i);
    }

    public String win()
    {
        if(door == cardoor){
            System.out.println("You won the car!");
        }
        else
        {
            System.out.println("The car is behind door " + cardoor + ". You lost! (Or you could say you won a goat!)");
        }
        return "";
    }








}

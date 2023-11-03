public class MontyHallGame
{
    private int door;
    private int goatdoor;
    private String change;

    public MontyHallGame(int door, String change)
    {
        this.door = door;
        this.change = change;
    }

    public MontyHallGame(int door)
    {
        this.door = door;
    }

    public int cardoor()
    {
       return (int) (Math.random()*3 + 1);
    }

    public int goat1()
    {
        if(door == 1 && cardoor() == 2)
        {
            goatdoor = 3;
        }
        if(door == 1 && cardoor() ==3)
        {
            goatdoor = 2;
        }
        if(door == 2 && cardoor() == 1)
        {
            goatdoor = 3;
        }
        if(door == 2 && cardoor() == 3)
        {
            goatdoor = 1;
        }
        if(door == 3 && cardoor() == 1)
        {
            goatdoor = 2;
        }
        if(door == 3 && cardoor() == 2)
        {
            goatdoor = 1;
        }


        return goatdoor;
    }

    public boolean change()
    {
        if(change.equals("No"))
        {
            return false;

        }
        else if(change.equals("Yes")){
            return true;
        }
        return false;
    }

    public int switcher()
    {
        if(change() == true) {
            int switches = 0;
            if (goat1() == 1 && door == 2) {
                switches = 3;
            }
            if (goat1() == 1 && door == 3) {
                switches = 2;
            }
            if (goat1() == 2 && door == 1) {
                switches = 3;
            }
            if (goat1() == 2 && door == 3) {
                switches = 1;
            }
            if (goat1() == 3 && door == 2) {
                switches = 1;
            }
            if (goat1() == 3 && door == 1) {
                switches = 2;
            }
                System.out.println("Guess switched from " + door + " to " + switches);

        }
        return door;
    }
    public String win()
    {
        if(switcher() == cardoor()){
            System.out.println("You won the car!");
        }
        else
        {
            System.out.println("The car is behind door " + cardoor() + ". You lost! (Or you could say you won a goat!)");
        }
        return "";
    }








}

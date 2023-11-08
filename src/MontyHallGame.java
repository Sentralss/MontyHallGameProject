public class MontyHallGame
{
    private int door;
    private int goatdoor;
    private String change;

    public MontyHallGame(int door)
    {
        this.door = door;
    }
    public MontyHallGame(int door, String change)
    {
        this.door = door;
        this.change = change;
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
        else if(door == 1 && cardoor() == 3)
        {
            goatdoor = 2;
        }
        else if(door == 2 && cardoor() == 1)
        {
            goatdoor = 3;
        }
        else if(door == 2 && cardoor() == 3)
        {
            goatdoor = 1;
        }
        else if(door == 3 && cardoor() == 1)
        {
            goatdoor = 2;
        }
        else if(door == 3 && cardoor() == 2)
        {
            goatdoor = 1;
        }
        return goatdoor;
    }

    public boolean change()
    {
        if(change.equals("No") || change.equals("no"))
        {
            return false;

        }
        else if(change.equals("Yes") || change.equals("yes")){
            return true;
        }
        return false;
    }

    public int switcher()
    {
        if(change() == true) {
            if (goatdoor == 1 && door == 2) {
                door = 3;
            }
            else if (goatdoor == 1 && door == 3) {
                door = 2;
            }
            else if (goatdoor == 2 && door == 1) {
                door = 3;
            }
            else if (goatdoor == 2 && door == 3) {
                door = 1;
            }
            else if (goatdoor == 3 && door == 2) {
                door = 1;
            }
            else if (goatdoor == 3 && door == 1) {
                door = 2;
            }

        }
        return door;
    }
    public String win()
    {
        if(door == cardoor()){
            System.out.println("You won the car!");
        }
        else
        {
            System.out.println("The car is behind door " + cardoor() + ". You lost! (Or you could say you won a goat!)");
        }
        return "";
    }








}

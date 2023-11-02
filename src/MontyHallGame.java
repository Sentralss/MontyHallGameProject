public class MontyHallGame
{
    private int door;
    private double goat;
    private String change;

    public MontyHallGame(int door, String change)
    {
        this.door = door;
        this.change = change;
    }

    public int goat1()
    {
        if(door == 1)
        {
            goat = (Math.random()*3 + 2);
        }
        if(door == 2)
        {
            goat = (Math.random()*2 + 1);
            if (goat == 2)
            {
                goat++;
            }
        }
        if(door == 3)
        {
            goat = (Math.random()*2 + 1);
        }
        return (int) goat;
    }

    public boolean swtich()
    {
        if(change.equals("No"))
        {

        }
    }






}

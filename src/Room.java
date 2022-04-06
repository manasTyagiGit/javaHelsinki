public class Room 
{
    private String  code;
    private int     numberOfSeats;
    
    public Room (String code, int numberOfSeats)
    {
        this.code = code;
        this.numberOfSeats = numberOfSeats;
    }

    protected int getNumberOfSeats ()
    {
        return this.numberOfSeats;
    }

    protected String getCode ()
    {
        return this.code;
    }
}

public class Timer 
{
    private ClockHand seconds;
    private ClockHand hundred;
    
    public Timer ()
    {
        this.seconds = new ClockHand (60);
        this.hundred = new ClockHand (100);
    }

    public void advance ()
    {
        this.hundred.advance();
        if (this.hundred.value() == 0)
        {
            this.seconds.advance();
        }

    }

    public String toString ()
    {
        return this.seconds + " : " + this.hundred;
    }
    
}

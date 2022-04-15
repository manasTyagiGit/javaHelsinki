public class Agent 
{
    private String fName, lName;
    
    public Agent (String fName, String lName)
    {
        this.fName = fName;
        this.lName = lName;
    }

    public String toString ()
    {
        return "My name is " + this.lName + ", " + this.fName + " " + this.lName;
    }
}

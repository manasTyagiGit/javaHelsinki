import java.util.ArrayList;

public class Hold 
{
    private ArrayList <Suitcase> suitcases = new ArrayList<>();
    private int maxWeight;
    private int curWeight;
    private int noOfSuitcases;

    public Hold (int maxWeight)
    {
        this.maxWeight = maxWeight;
        this.curWeight = 0;
        this.noOfSuitcases = 0;
    }   
    
    public void addSuitcase (Suitcase suitcase)
    {
        if (this.curWeight + suitcase.totalWeight() <= this.maxWeight)
        {
            suitcases.add (suitcase);
            this.curWeight += suitcase.totalWeight();
            this.noOfSuitcases++;
        }
    }

    public String toString ()
    {
        return this.noOfSuitcases + " suitcases (" + this.curWeight + " kg)";
    }

    public void printItems ()
    {
        for (Suitcase x : suitcases)
        {
                x.printItems();
        }
    }
}

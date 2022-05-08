import java.util.ArrayList;

public class Suitcase 
{
    private ArrayList <Item> items = new ArrayList<>();
    private int maxWeight;
    private int curWeight;
    private int noOfItems;
    
    public Suitcase (int maxWeight)
    {
        this.maxWeight = maxWeight;
        this.curWeight = 0;
        this.noOfItems = 0;
    }

    public void addItem (Item item)
    {
        if (item.getWeight() + this.curWeight <= this.maxWeight)
        {
            items.add (item);
            this.curWeight += item.getWeight();
            this.noOfItems++;
        }
    }

    public String toString ()
    {
        if (this.noOfItems == 0)
        {
            return "no items (0 kg)";
        }

        if (this.noOfItems == 1)
        {
            return "1 item (" + this.curWeight + " kg)";
        }
        return this.noOfItems + " items (" + this.curWeight + " kg)";
    }

    public void printItems ()
    {
        for (Item item : items)
        {
            System.out.println (item);
        }       
    }

    public int totalWeight ()
    {
        return this.curWeight;
    }

    public Item heaviestItem ()
    {

        if (items.size() == 0)          return null;
        
        Item item = items.get(0);

        for (Item x : items)
        {
            if (item.getWeight() < x.getWeight())
            {
                item = x;
            }
        }

        return item;
    }

}

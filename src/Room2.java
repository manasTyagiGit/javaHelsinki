import java.util.ArrayList;

public class Room2
{
    private ArrayList <Person2> rm2;
    public Room2 ()
    {
        rm2 = new ArrayList<>();
    }

    public void add (Person2 person)
    {
        rm2.add(person);
    }

    public boolean isEmpty ()
    {
        return rm2.isEmpty();
    }

    public ArrayList <Person2> getPersons ()
    {
        return rm2;
    }

    public Person2 shortest ()
    {
        if (this.rm2.isEmpty())     return null;

        Person2 p = this.rm2.get(0);
        for (Person2 px : rm2)
        {
            if (px.getHeight () < p.getHeight())
            {
                p = px;
            }
        }
        return p;
    }

    public Person2 take ()
    {
        if (this.rm2.isEmpty())     return null;

        Person2 p = this.shortest();
        this.rm2.remove(p);

        return p;   
    }


}
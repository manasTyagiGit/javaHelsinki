public class Person2 
{
    private String name;
    private int height;

    public Person2 (String name, int height)
    {
        this.name = name;
        this.height = height;
    }

    public String toString()
    {
        return this.name + " (" + this.height + " cm)";
    }

    public void setName (String newName)
    {
        this.name = newName;
    }

    public void setHeight (int newHeight)
    {
        this.height = newHeight;
    }

    public String getName ()
    {
        return this.name;
    }

    public int getHeight ()
    {
        return this.height;
    }
}

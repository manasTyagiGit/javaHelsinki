public class Person 
{
    private String  name;
    private int     age;

    public Person (String name, int age)
    {
        this.name   = name;
        this.age    = age;
    }

    public String getName ()
    {
        return this.name;
    }
    
    public int getAge ()
    {
        return this.age;
    }

    public String toString() 
    {
        return this.name + ", age " + this.age + " years";
    }

    public void growOlder ()
    {
        if (this.age < 30)
        {
            this.age += 1;
        }
    }
}

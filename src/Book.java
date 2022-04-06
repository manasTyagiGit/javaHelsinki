public class Book
{
    private String name;
    private int pages, pubYear;

    Book (String name, int pages, int pubYear)
    {
        this.name = name;
        this.pages = pages;
        this.pubYear = pubYear;
    }

    public String getName ()
    {
        return this.name;
    }

    @Override
    public String toString ()
    {
        return this.name + ", " + this.pages + ", " + this.pubYear;
    }
}
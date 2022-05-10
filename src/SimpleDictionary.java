import java.util.ArrayList;

public class SimpleDictionary 
{
    private ArrayList <String> words;
    private ArrayList <String> means;

    public SimpleDictionary ()
    {
        this.words = new ArrayList<>();
        this.means = new ArrayList<>();
    }

    public void add (String word, String mean)
    {
        this.words.add (word);
        this.means.add (mean);
    }   
    
    public String translate (String word)
    {
        String mean = "Word " + word + " was not found";

        int index = words.indexOf (word);

        if (index != -1)
        {
            mean = means.get (index);
        }

        return mean;
    }
}

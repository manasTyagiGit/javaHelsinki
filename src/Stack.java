import java.util.ArrayList;

public class Stack 
{
    private ArrayList <String> stackEle;

    public Stack ()
    {
        stackEle = new ArrayList <>();        
    }

    public boolean isEmpty()
    {
        if (stackEle.isEmpty())     return true;
        return false;
    }

    public void add (String value)
    {
        stackEle.add (value);
    }

    public ArrayList <String> values ()
    {
        return stackEle;
    }

    public String take ()
    {
        String top = stackEle.get(stackEle.size() - 1);
        stackEle.remove(stackEle.size() - 1);
        return top;
    }

    

}

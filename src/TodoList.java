import java.util.*;

public class TodoList 
{
    private ArrayList <String> tasks;

    public TodoList ()
    {
        this.tasks = new ArrayList<>();
    }

    public void add (String task)
    {
        tasks.add (task);
    }

    public void print ()
    {
        for (String task : tasks)
        {
            System.out.println (Integer.valueOf(tasks.indexOf(task) + 1) + ": " + task);
        }
    }

    public void remove (int number)
    {
        int index = number - 1;
        tasks.remove (index);
    }
}

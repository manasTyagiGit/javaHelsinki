import java.util.*;

public class UserInterface 
{
    private TodoList todoList;
    private Scanner scanner;
    private String command, task;
    private int index;

    public UserInterface (TodoList todoList, Scanner scanner)
    {
        this.todoList = todoList;
        this.scanner = scanner;
    }    

    public void addTask ()
    {
        System.out.print ("To add: ");
        task = scanner.nextLine();
        todoList.add (task);
    }

    public void removeTask ()
    {
        System.out.print ("To remove: ");
        index = Integer.parseInt(scanner.nextLine());
        todoList.remove (index);
    }

    public void start ()
    {
        System.out.print ("Command: ");
        command = scanner.nextLine();

        while (!command.equals ("stop"))
        {
            if (command.equals ("add"))
            {
                this.addTask ();
            }

            else if (command.equals ("list"))
            {
                todoList.print();
            }

            else if (command.equals ("remove"))
            {
                this.removeTask();
            }

            System.out.print ("Command: ");
            command = scanner.nextLine();
        }
    }
}

import java.util.*;
//import java.nio.file.Paths;
//import java.lang.*;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        TodoList todoList = new TodoList ();
        Scanner scanner = new Scanner (System.in);

        UserInterface ui = new UserInterface(todoList, scanner);
        ui.start();
              
    }
}

import java.util.Scanner;

public class TextUI 
{
    private SimpleDictionary book;
    private Scanner scanner;
    private String command, word, transl;

    public TextUI (Scanner scanner, SimpleDictionary book)
    {
        this.book = book;
        this.scanner = scanner;
    }
    
    public void start ()
    {
        System.out.print ("Command: ");
        command = scanner.nextLine();

        while (!command.equals ("end"))
        {
            if (command.equals ("add"))
            {
                System.out.print ("Word: ");
                word = scanner.nextLine();
                System.out.print ("Translation: ");
                transl = scanner.nextLine();

                book.add (word, transl);
            }

            else if (command.equals ("search"))
            {
                System.out.print ("To be translated: ");
                word = scanner.nextLine();
                System.out.println ("Translation: " + book.translate(word));
            }

            else
            {
                System.out.println ("Unknown Command");
            }

            System.out.print ("Command: ");
            command = scanner.nextLine();
        }

        System.out.println ("Bye bye!");
    }

}

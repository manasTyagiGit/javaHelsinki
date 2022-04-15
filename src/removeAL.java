import java.util.*;

public class removeAL {
    public static void main (String[] args)
    {
        ArrayList <Integer> list = new ArrayList<>();

        int input = 0;
        Scanner scan = new Scanner (System.in);

        while (true)
        {
            input = scan.nextInt ();
            if (input == 0)     break;
            list.add (input);
        }
        // Let's print the list        
        printList (list);

        // Let's remove the base index and then print
        list.remove(0);
        printList (list);

        // Let's input a new key and remove that        
        int key = scan.nextInt ();
        list.remove(Integer.valueOf(key));
        printList(list);

        scan.close ();
    } 

    public static void printList (ArrayList <Integer> list)
    {
        for (int x : list)
        {
            System.out.print (x +  " ");
        }

        System.out.println ();
    }
}

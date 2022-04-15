import java.util.*;

public class forEach {
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
        scan.close ();

        for (int x : list)
        {
            System.out.print (x +  " ");
        }

        System.out.println ();
    }
}

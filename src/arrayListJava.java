import java.util.ArrayList;
import java.util.Scanner;

public class arrayListJava {
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
        System.out.println (list.get(1) + list.get(2));
    }
}

import java.lang.*;
import java.util.*;
import java.io.*;

public class patternTree {

    public static void main (String[] args)
    {
        int n = 0;
        Scanner intScan = new Scanner (System.in);
        n = intScan.nextInt ();
        intScan.close();

        createTree (n);
        printBase (n);
    }

    public static void createTree (int n)
    {
        int i = 0, j = 0, k = 0;

        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                if ((i + j) >= (n - 1))
                {
                    System.out.print ("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            
            for (k = n; k <= (2*n - 2); k++)
            {
                if ((k - i) <= (n - 1))
                {
                    System.out.print ("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println ();
        }
    }

    public static void printBase (int n)
    {
        int offset = n - 2;
        int i = 2;

        while (i > 0)
        {
            printWhiteSpaces (offset);
            printStars (3);
            i--;
        }
    }

    public static void printWhiteSpaces (int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print (" ");
        }        
    }

    public static void printStars (int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print ("*");
        }
        System.out.println(); 
    }
}
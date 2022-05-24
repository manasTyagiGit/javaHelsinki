import java.util.*;
//import java.nio.file.Paths;
//import java.lang.*;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scan = new Scanner (System.in);  

        int n = 0, s = 0, p = 0, ps = 0;
        int i = 0;

        i = Integer.valueOf(scan.nextLine());
        while (i != -1)
        {
            if (i >= 0) 
            {    
                s = s + i;
                n++;

                if (i >= 50)
                {
                    ps = ps + i;
                    p++;
                }
            }
            i = Integer.valueOf(scan.nextLine());
        }

        scan.close();
        
        Grade grade1 = new Grade (n , s, p, ps);

        System.out.println ("Point average (all): " + grade1.calcAverage ());

        if (ps > 0)         System.out.println ("Point average (passing): " + grade1.calcPassingAverage ());
        else                System.out.println ("Point average (passing): -");

        System.out.println ("Pass percentage: " + grade1.calcPassPerc ());
              
    }
}

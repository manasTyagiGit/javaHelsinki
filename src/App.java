import java.util.*;
import java.nio.file.Paths;
//import java.lang.*;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner (System.in);
        System.out.println ("What file you want to open ? ");
        String ip  = input.nextLine();

        try
        {
            Scanner file = new Scanner (Paths.get ("/home/manastyagi/Desktop/sample/src/" + ip));
           
            System.out.println ("Team: ");
            String teamIp = input.nextLine ();
            int games = 0;
            int wins = 0, losses = 0;

            while (file.hasNextLine())
            {
                String[] ipLine = file.nextLine().split(",");
                if (ipLine[0].equals(teamIp))
                {
                    games++;
                    if (Integer.valueOf(ipLine[2]) > Integer.valueOf(ipLine[3]))
                    {
                        wins++;
                    }
                    else
                    {
                        losses++;
                    }
                }

                if (ipLine[1].equals(teamIp))
                {
                    games++;
                    if (Integer.valueOf(ipLine[3]) > Integer.valueOf(ipLine[2]))
                    {
                        wins++;
                    }
                    else
                    {
                        losses++;
                    }
                }
            }
                        
            file.close();

            System.out.println ("Games: " + games);
            System.out.println ("Wins: " + wins);
            System.out.println ("Losses: " + losses);
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

        
        input.close ();
    
    }
}

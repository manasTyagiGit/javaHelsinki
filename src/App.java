//import java.util.*;
//import java.nio.file.Paths;
//import java.lang.*;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Clock clock = new Clock();
        int n = 25;
        while (n-- > 1) {
            System.out.println(clock);
            clock.advance();
        }    

        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

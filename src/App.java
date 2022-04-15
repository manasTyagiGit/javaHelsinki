//import java.util.*;
//import java.nio.file.Paths;
//import java.lang.*;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Cube oSheaJackson = new Cube(4);
        System.out.println(oSheaJackson.volume());
        System.out.println(oSheaJackson);

        System.out.println();

        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);

    }
}

import java.util.Scanner;

public class ConsoleRead
{
    public static int readInt()
    {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            return scanner.nextInt();
        } else return 0;
    }
    public static double readDouble()
    {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextDouble())
        {
            return scanner.nextDouble();
        }
        else return 0;
    }
}

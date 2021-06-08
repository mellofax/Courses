import java.util.Scanner;

public class ConsoleReader
{
    private Scanner scanner = new Scanner(System.in);
    public double readDouble()
    {

        if(scanner.hasNextDouble())
        {
            return scanner.nextDouble();
        }
        else return 0;
    }

    public int readInt()
    {
        if(scanner.hasNextInt())
        {
            return scanner.nextInt();
        }else return 404;
    }
    public String readString()
    {
        return scanner.next();
    }
}

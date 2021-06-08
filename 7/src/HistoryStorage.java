import java.util.ArrayList;

public class HistoryStorage
{
    private ArrayList<History> list = new ArrayList<>();

    public void addhistory(History history)
    {
        list.add(history);
    }
    public void getallhistory()
    {
        for(History d: list)
            ConsoleWrite.Write(d.toString());
    }
    public void clearhistory()
    {
        list.clear();
    }
    public void delelemfromhistory(int index)
    {
        try {
            if (index > list.size() || index < 0)
                throw new Exception("Такого индекса нет");
            list.remove(index);
        }
        catch (Exception a)
        {
            System.out.println(a);
        }
    }

}

package company;

import Static.ConsoleWrite;

import java.util.ArrayList;

public abstract class HistoryStorage implements HistoryInterface
{
    private ArrayList<History> list = new ArrayList<>();
    @Override

    public void addhistory(History history) { list.add(history);
    }

    @Override
    public void getallhistory() {
        try {
            if(list.size() == 0)
                throw new Exception("История пуста!");
            for (History d : list)
                ConsoleWrite.Write(d.toString());
        }
        catch (Exception a)
        {
            ConsoleWrite.Write(a.getMessage());
        }
    }

    @Override
    public void clearhistory()
    {
        try {
            if(list.size() == 0)
                throw new Exception("История и так пустая!");
            list.clear();
        }
        catch (Exception a) {
            ConsoleWrite.Write(a.getMessage());
        }
    }

    @Override
    public void delelemfromhistory(int index) {
        try {
            if (index > list.size() || index < 0)
                throw new Exception("Такого индекса нет");
            list.remove(index);
        }
        catch (Exception a)
        {
            ConsoleWrite.Write(a.getMessage());
        }
    }
}

import java.util.ArrayList;

public class AdminMenu
{
    private ConsoleReader consoleReader = new ConsoleReader();
    private ConsoleWriter consoleWriter = new ConsoleWriter();
    public void run(ArrayList<User> list) {
        while (true)
        {
            menu();
            switch (consoleReader.readInt())
            {
                case 0: return;
                case 1:
                    int id = 0;
                    consoleWriter.WriteString("[ID]==[Login]==[Password]====");
                    for(User d: list) {
                        consoleWriter.WriteString(" [" +id+ "]    " +d.getName() + "     " + d.getPassword());
                        id+=1;
                    }
                    consoleWriter.WriteString("=============================");
                    consoleWriter.WriteString("");
                    break;
                case 2:
                    try {
                        int delete = getint("Введите ID удаляемого пользователя");
                        if (list.get(delete).getName().equals("Admin"))
                            throw new Exception("Админа удалить нельзя!");
                        else {
                            list.remove(delete);
                            consoleWriter.WriteString("Пользователь удален!");
                        }
                    }
                    catch (Exception e)
                    {
                        consoleWriter.WriteString(e.getMessage());
                    }
                    break;
                case 3:
                    Calculator calculator = new Calculator();
                    calculator.run();
                    break;
                case 404:
                    consoleWriter.WriteString("Вы ввели неверное значение");
                    return;
            }
        }
    }
    private void menu()
    {
        consoleWriter.WriteString("=Кабинет==Админа=");
        consoleWriter.WriteString("1 - Посмотреть пользователей");
        consoleWriter.WriteString("2 - Удалить пользователя");
        consoleWriter.WriteString("3 - Калькулятор");
        consoleWriter.WriteString("0 - Выход");
        consoleWriter.WriteString("================");
    }
    private int getint(String s)
    {
        consoleWriter.WriteString(s);
        return consoleReader.readInt();
    }
}

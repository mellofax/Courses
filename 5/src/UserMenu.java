import java.util.ArrayList;

public class UserMenu
{
    private ConsoleReader consoleReader = new ConsoleReader();
    private ConsoleWriter consoleWriter = new ConsoleWriter();
    public void run(User user, ArrayList<User> list)
    {
        while (true)
        {
            menu();
            switch (consoleReader.readInt())
            {
                case 0: return;
                case 1:
                    try {
                        String s1 = getinfo("Введите новое имя");
                        for (User d : list)
                        {
                            if (d.getName().equals(s1))
                                throw new Exception("Пользователь с таким логином уже есть!");
                        }
                        user.setName(s1);
                        break;
                    }
                    catch (Exception e)
                    {
                        consoleWriter.WriteString("Ошибка смены имени");
                        consoleWriter.WriteString(e.getMessage());
                    }
                case 2:
                    try {
                        String s2 = getinfo("Введите новый пароль");
                        user.setPassword(s2);
                        break;
                    }
                    catch (Exception e)
                    {
                        consoleWriter.WriteString(e.getMessage());
                    }
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
        consoleWriter.WriteString("=Личный==Кабинет=");
        consoleWriter.WriteString("1 - Сменить имя");
        consoleWriter.WriteString("2 - Сменить пароль");
        consoleWriter.WriteString("3 - Калькулятор");
        consoleWriter.WriteString("0 - Выход");
        consoleWriter.WriteString("================");
    }
    private String getinfo(String s)
    {
        consoleWriter.WriteString(s);
        return consoleReader.readString();
    }
}

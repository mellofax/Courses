import java.util.ArrayList;

public class Menu
{
    private ConsoleReader consoleReader = new ConsoleReader();
    private ConsoleWriter consoleWriter = new ConsoleWriter();
    private User user = new User();
    private ArrayList<User> spisok = new ArrayList<User>();

    public void run()
    {
        boolean flag = true;
        while (true)
        {
            menu();
            switch (consoleReader.readInt())
            {
                case 0:
                    return;
                case 1:
                    try {
                        if(spisok.size() == 0)
                            throw new Exception("Нет зарегестрированных пользователей");
                        String s1 = getinfo("Введите Login");
                        String s2 = getinfo("Введите Пароль");
                        for (User d : spisok)
                        {
                            if(d.getName().equals("Admin") && d.getName().equals(s1))
                            {
                                if(d.getPassword().equals("Admin") && d.getName().equals(s2))
                                {
                                    AdminMenu adminMenu = new AdminMenu();
                                    adminMenu.run(spisok);
                                }
                                else throw new Exception("Неверный пароль");
                            }
                            else if(d.getName().equals(s1))
                            {
                                if(d.getPassword().equals(s2))
                                {
                                    UserMenu userMenu = new UserMenu();
                                    userMenu.run(d, spisok);
                                }
                                else throw new Exception("Неверный пароль");
                            }
                        }
                    }
                    catch(Exception e)
                    {
                        consoleWriter.WriteString(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        String s3 = getinfo("Введите Login");
                        if(s3.equals("Admin"))
                            throw new Exception("Такой Login недоступен");
                        for (User d : spisok)
                        {
                            if (d.getName().equals(s3))
                                throw new Exception("Пользователь с таким логином уже есть!");
                        }
                        String s4 = getinfo("Введите Пароль");
                        user.setName(s3);
                        user.setPassword(s4);
                        spisok.add(user);
                        user = new User();
                    }
                    catch(Exception e)
                    {
                        consoleWriter.WriteString(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        for (User d : spisok)
                        {
                            if (d.getName().equals("Admin"))
                            {
                                if(spisok.size() == 1)
                                    throw new Exception("Админ - единственный пользователь, его нельзя удалить");
                                spisok.remove(d);
                                flag = false;
                                consoleWriter.WriteString("Админ Выключен");
                            } else flag = true;
                        }
                        if (flag) {
                            user.setName("Admin");
                            user.setPassword("Admin");
                            spisok.add(user);
                            consoleWriter.WriteString("Админ Включен (Логин/Пароль = Admin)");
                            user = new User();
                        }
                    }
                    catch (Exception e)
                    {
                        consoleWriter.WriteString(e.getMessage());
                    }
                    break;
                case 404:
                    consoleWriter.WriteString("Вы ввели неверное значение, перезапустите программу");
                    return;
            }
        }
    }
    private void menu()
    {
        consoleWriter.WriteString("================");
        consoleWriter.WriteString("1 - Войти");
        consoleWriter.WriteString("2 - Регистрация");
        consoleWriter.WriteString("3 - Админ Вкл/Выкл");
        consoleWriter.WriteString("0 - Выход");
        consoleWriter.WriteString("================");
    }
    private String getinfo(String s)
    {
        consoleWriter.WriteString(s);
        return consoleReader.readString();
    }
}

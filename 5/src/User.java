import java.io.Serializable;

public class User implements Serializable
{
    private String name;
    private String password;
    private ConsoleWriter consoleWriter = new ConsoleWriter();

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name)
    {
        try
        {
            if (name.length() > 2)
            {
                this.name = name;
            }else throw new Exception("Логин слишком короткий");
        }
        catch(Exception e)
        {
            consoleWriter.WriteString(e.getMessage());
        }
    }

    public void setPassword(String password)
    {
        try {
            if (password.length() > 2) {
                this.password = password;
            } else throw new Exception("Пароль слишком короткий");
        }
        catch(Exception e)
        {
            consoleWriter.WriteString(e.getMessage());
        }
    }
}

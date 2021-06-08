package company;

import Static.CalculatorFunctional;
import Static.ConsoleRead;
import Static.ConsoleWrite;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculatorV2 extends HistoryStorage implements CalculatorInterface
{
    private SimpleDateFormat dateformarter = new SimpleDateFormat("hh:mm:ss");

    @Override
    public void start()
    {
        while (true)
        {
            menu();
            double num = 0;
            double num1 = 0;
            switch (ConsoleRead.readInt())
            {
                case 0:
                    return;
                case 1:
                    num = getNumber("Enter num1");
                    num1 = getNumber("Enter num2");
                    addhistory(getHistory(num,num1,"Сумма", CalculatorFunctional.sum(num,num1), dateformarter.format(getdata())));
                    break;
                case 2:
                    num = getNumber("Enter num1");
                    num1 = getNumber("Enter num2");
                    addhistory(getHistory(num,num1,"Вычитание", CalculatorFunctional.sub(num,num1), dateformarter.format(getdata())));
                    break;
                case 3:
                    num = getNumber("Enter num1");
                    num1 = getNumber("Enter num2");
                    addhistory(getHistory(num,num1,"Умножение", CalculatorFunctional.mul(num,num1), dateformarter.format(getdata())));
                    break;
                case 4:
                    try {
                        num = getNumber("Enter num1");
                        num1 = getNumber("Enter num2");
                        if(num1 == 0)
                            throw new Exception("Попытка деления на нуль!");
                        addhistory(getHistory(num,num1,"Деление", CalculatorFunctional.div(num,num1), dateformarter.format(getdata())));
                    }
                    catch (Exception a) {
                        ConsoleWrite.Write(a.getMessage());
                    }
                    break;
                case 5:
                    num = getNumber("Enter num1");
                    addhistory(getHistory(num, 0,"Синус", CalculatorFunctional.sin(num), dateformarter.format(getdata())));
                    break;
                case 6:
                    num = getNumber("Enter num1");
                    addhistory(getHistory(num, 0,"Косинус", CalculatorFunctional.cos(num), dateformarter.format(getdata())));
                    break;
                case 7:
                    history();
                    break;
                default:
                    ConsoleWrite.Write("Некорректный ввод");
                    break;
            }
        }
    }
    @Override
    public void menu()
    {
        ConsoleWrite.Write("====CHOOSE==OPERATION====");
        ConsoleWrite.Write("1 - sum (сумма)");
        ConsoleWrite.Write("2 - sub (вычитание)");
        ConsoleWrite.Write("3 - mul (умножение)");
        ConsoleWrite.Write("4 - div (деление)");
        ConsoleWrite.Write("5 - sin (синус)");
        ConsoleWrite.Write("6 - cos (косинус) ");
        ConsoleWrite.Write("7 - История операций");
        ConsoleWrite.Write("0 - ВЫХОД");
        ConsoleWrite.Write("=======================");
    }

    @Override
    public double getNumber(String s) {
        ConsoleWrite.Write(s);
        return ConsoleRead.readDouble();
    }
    private Date getdata() {
        return new Date();
    }
    private History getHistory(double num, double num1, String operation, double result, String date)
    {
        return new History(num,num1,operation,result,date);
    }
    private void history()
    {
        while(true) {
            historymenu();
            switch (ConsoleRead.readInt())
            {
                case 0:
                    return;
                case 1:
                    getallhistory();
                    break;
                case 2:
                    clearhistory();
                    break;
                case 3:
                    ConsoleWrite.Write("Введите индекс удаляемой записи истории");
                    delelemfromhistory(ConsoleRead.readInt());
                    break;
                default:
                    ConsoleWrite.Write("Некорректный ввод");
                    break;
            }
        }
    }
    private void historymenu()
    {
        ConsoleWrite.Write("0 - Выход");
        ConsoleWrite.Write("1 - Просмотреть историю");
        ConsoleWrite.Write("2 - Очистить историю");
        ConsoleWrite.Write("3 - удалить одну запись из истории");
    }
}

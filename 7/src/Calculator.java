import java.util.Date;

public class Calculator extends CalculatorFunctional implements CalculatorHistoryList {
    public void run()
    {
        typeofcalculator();
        int type = ConsoleRead.readInt();
        if(type <= 2 || type < 0)
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
                    list.add(getHistory(num, num1, "Сумма", super.sum(num, num1), dateformarter.format(getdata())));
                    break;
                case 2:
                    num = getNumber("Enter num1");
                    num1 = getNumber("Enter num2");
                    list.add(getHistory(num, num1, "Вычитание", super.sub(num, num1), dateformarter.format(getdata())));
                    break;
                case 3:
                    num = getNumber("Enter num1");
                    num1 = getNumber("Enter num2");
                    list.add(getHistory(num, num1, "Умножение", super.mul(num, num1), dateformarter.format(getdata())));
                    break;
                case 4:
                    try {
                        num = getNumber("Enter num1");
                        num1 = getNumber("Enter num2");
                        if (num1 == 0) {
                            throw new Exception("Делить на нуль нельзя!");
                        }
                        list.add(getHistory(num, num1, "Деление", super.div(num, num1), dateformarter.format(getdata())));
                    }
                    catch (Exception a)
                    {
                        ConsoleWrite.Write(String.valueOf(a));
                    }
                    break;
                case 5:
                    num = getNumber("Enter num");
                    list.add(getHistory(num, num1, "Синус", super.sin(num), dateformarter.format(getdata())));
                    break;
                case 6:
                    num = getNumber("Enter num");
                    list.add(getHistory(num, num1, "Косинус", super.cos(num), dateformarter.format(getdata())));
                    break;
                case 7:
                    if (list.size() == 0)
                    {
                        ConsoleWrite.Write("История пустует");
                    } else {
                        for (History d : list)
                            ConsoleWrite.Write(d.toString());
                    }
                    break;
            }
        }
    }

    private void menu()
    {
        ConsoleWrite.Write("====CHOOSE==OPERATION====");
        ConsoleWrite.Write("1 - sum (сумма)");
        ConsoleWrite.Write("2 - sub (вычитание)");
        ConsoleWrite.Write("3 - mul (умножение)");
        ConsoleWrite.Write("4 - div (деление)");
        ConsoleWrite.Write("5 - sin (синус)");
        ConsoleWrite.Write("6 - cos (косинус) ");
        ConsoleWrite.Write("7 - История Операций");
        ConsoleWrite.Write("0 - ВЫХОД");
        ConsoleWrite.Write("=======================");
    }
    private void typeofcalculator()
    {
        ConsoleWrite.Write("Выберите версию калькулятора");
        ConsoleWrite.Write("1 - старый | 2 - новый");
    }

    private double getNumber(String s) {
        ConsoleWrite.Write(s);
        return ConsoleRead.readDouble();
    }

    private Date getdata() {
        return new Date();
    }

    private History getHistory(double num1, double num2, String operationType, double result, String date) {
        return new History(num1, num2, operationType, result, date);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.run();
    }
}

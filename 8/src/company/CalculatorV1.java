package company;

import Static.CalculatorFunctional;
import Static.ConsoleRead;
import Static.ConsoleWrite;

public class CalculatorV1 implements CalculatorInterface{
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
                    ConsoleWrite.Write("Result: " + CalculatorFunctional.sum(num,num1));
                    break;
                case 2:
                    num = getNumber("Enter num1");
                    num1 = getNumber("Enter num2");
                    ConsoleWrite.Write("Result: " + CalculatorFunctional.sub(num,num1));
                    break;
                case 3:
                    num = getNumber("Enter num1");
                    num1 = getNumber("Enter num2");
                    ConsoleWrite.Write("Result: " + CalculatorFunctional.mul(num,num1));
                    break;
                case 4:
                    try {
                        num = getNumber("Enter num1");
                        num1 = getNumber("Enter num2");
                        if(num1 == 0)
                            throw new Exception("Попытка деления на нуль!");
                        ConsoleWrite.Write("Result: " + CalculatorFunctional.div(num, num1));
                    }
                    catch (Exception a) {
                        ConsoleWrite.Write(a.getMessage());
                    }
                    break;
                case 5:
                    num = getNumber("Enter num1");
                    ConsoleWrite.Write("Result: " + CalculatorFunctional.sin(num));
                    break;
                case 6:
                    num = getNumber("Enter num1");
                    ConsoleWrite.Write("Result: " + CalculatorFunctional.cos(num));
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
        ConsoleWrite.Write("0 - ВЫХОД");
        ConsoleWrite.Write("=======================");
    }

    @Override
    public double getNumber(String s) {
        ConsoleWrite.Write(s);
        return ConsoleRead.readDouble();
    }

}

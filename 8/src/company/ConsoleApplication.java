package company;

import Static.ConsoleRead;
import Static.ConsoleWrite;

public class ConsoleApplication
{
    public void run()
    {
        while(true)
        {
            menu();
            switch(ConsoleRead.readInt())
            {
                case 0:
                    return;
                case 1:
                    CalculatorV1 calculatorV1 = new CalculatorV1();
                    calculatorV1.start();
                    break;
                case 2:
                    CalculatorV2 calculatorV2 = new CalculatorV2();
                    calculatorV2.start();
                    break;
                default:
                    ConsoleWrite.Write("Некорректный ввод");
                    break;
            }
        }
    }
    private void menu()
    {
        ConsoleWrite.Write("Какой калькулятор хотите использовать?");
        ConsoleWrite.Write("0 - выход || 1 - старый || 2 - новый");
    }
}

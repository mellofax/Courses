public class Calculator
{
    private CalculatorFunctional calculator = new CalculatorFunctional();
    private ConsoleReader consoleReader = new ConsoleReader();
    private ConsoleWriter consoleWriter = new ConsoleWriter();
    private History[] mas = new History[10];

    public void run()
    {
        int id = 0;
        while (true)
        {
            menu();
            if(id > mas.length || id == mas.length)
            {
                id = 0;
            }
            switch (consoleReader.readInt())
            {
                case 0:
                    return;
                case 1:
                    double num1 = getNumber("Enter num1");
                    double num2 = getNumber("Enter num2");
                    double s = calculator.sum(num1, num2);
                    consoleWriter.WriteString("Result " + s);
                    History history1 = new History(num1, num2, "Сумма", s);
                    mas[id] = history1;
                    id+=1;
                    break;
                case 2:
                    double num3 = getNumber("Enter num1");
                    double num4 = getNumber("Enter num2");
                    double s1 = calculator.sub(num3, num4);
                    consoleWriter.WriteString("Result " + s1);
                    History history2 = new History(num3, num4, "Вычитание", s1);
                    mas[id] = history2;
                    id+=1;
                    break;
                case 3:
                    double num5 = getNumber("Enter num1");
                    double num6 = getNumber("Enter num2");
                    double s2 = calculator.mul(num5, num6);
                    consoleWriter.WriteString("Result " + s2);
                    History history3= new History(num5, num6, "Умножение", s2);
                    mas[id] = history3;
                    id+=1;
                    break;
                case 4:
                    double num7 = getNumber("Enter num1");
                    double num8 = getNumber("Enter num2");
                    double s3 = calculator.div(num7, num8);
                    consoleWriter.WriteString("Result " + s3);
                    History history4= new History(num7, num8, "Деление", s3);
                    mas[id] = history4;
                    id+=1;
                    break;
                case 5:
                    double num9 = getNumber("Enter num");
                    double s4 = calculator.sin(num9);
                    consoleWriter.WriteString("Result " + s4);
                    History history5= new History(num9, 0, "Синус", s4);
                    mas[id] = history5;
                    id+=1;
                    break;
                case 6:
                    double num10 = getNumber("Enter num");
                    double s5 = calculator.cos(num10);
                    consoleWriter.WriteString("Result " + s5);
                    History history6= new History(num10, 0, "Косинус", s5);
                    mas[id] = history6;
                    id+=1;
                    break;
                case 7:
                    for (int i = 0; i < id; i++)
                    {
                        consoleWriter.WriteString(mas[i].toString());
                    }
                    break;
                case 404:
                    consoleWriter.WriteString("Вы ввели неверное значение");
                    return;
            }
        }
    }
    private void menu()
    {
        consoleWriter.WriteString("====CHOOSE==OPERATION====");
        consoleWriter.WriteString("1 - sum (сумма)");
        consoleWriter.WriteString("2 - sub (вычитание)");
        consoleWriter.WriteString("3 - mul (умножение)");
        consoleWriter.WriteString("4 - div (деление)");
        consoleWriter.WriteString("5 - sin (синус)");
        consoleWriter.WriteString("6 - cos (косинус) ");
        consoleWriter.WriteString("7 - История");
        consoleWriter.WriteString("0 - ВЫХОД");
        consoleWriter.WriteString("=======================");
    }
    private double getNumber(String s)
    {
        consoleWriter.WriteString(s);
        return consoleReader.readDouble();
    }

}
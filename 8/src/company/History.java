package company;

public class History
{
    private double num1;
    private double num2;
    private String operation;
    private double result;
    private String date;

    public History(double num1, double num2, String operation, double result, String date) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
        this.result = result;
        this.date = date;
    }

    public String toString()
    {
        if (num2 == 0) {
            return "История операций :" + " num1=" + num1 + ", " + "result=" + result +  ", " + "Тип операции: " + operation + ", " + "Время операции: " + date;
        } else {
            return "История операций :" + " num1=" + num1 + ", " + "num2=" + num2 + ", " + "result=" + result + ", " + "Тип операции: " + operation + ", " + "Время операции: " + date;
        }
    }
}

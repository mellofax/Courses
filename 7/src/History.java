public class History
{
    private double num1;
    private double num2;
    private String operationType;
    private double result;
    private String date;

    public History(double num1, double num2, String operationType, double result, String date) {
        this.num1 = num1;
        this.num2 = num2;
        this.operationType = operationType;
        this.result = result;
        this.date = date;
    }

    public String toString()
    {
        if (num2 == 0) {
            return "История операций :" + " num1=" + num1 + ", " + "result=" + result +  ", " + "Тип операции: " + operationType + ", " + "Время операции: " + date;
        } else {
            return "История операций :" + " num1=" + num1 + ", " + "num2=" + num2 + ", " + "result=" + result + ", " + "Тип операции: " + operationType + ", " + "Время операции: " + date;
        }
    }
}

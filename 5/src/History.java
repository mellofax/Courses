public class History {
    private double num1;
    private double num2;
    private String operationType;
    private double result;

    public History(double num1, double num2, String operationType, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.operationType = operationType;
        this.result = result;
    }

    @Override
    public String toString() {
        if (num2 == 0) {
            return "История операций :" + " num1=" + num1 + ", " + "result=" + result + " " + "Тип операции: " + operationType + "\r\n";
        } else {
            return "История операций :" + " num1=" + num1 + ", " + "num2=" + num2 + "result=" + result + " " + "Тип операции: " + operationType + "\r\n";
        }
    }
}

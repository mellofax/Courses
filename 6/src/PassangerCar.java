public class PassangerCar extends Car implements TypeOfTransport
{
    private int length;
    private String typeofregion;
    private String type;

    public PassangerCar(int speed, int tank, String color, int mileage, String firm, int number, int weight, int kolofwheel, int kolofdoor, String typeofdrive, String typeofmove, int length, String typeofregion, int num) {
        super(speed, tank, color, mileage, firm, number, weight, kolofwheel, kolofdoor, typeofdrive, typeofmove);
        this.length = length;
        this.typeofregion = typeofregion;
        setType(num);
    }

    private void setType(int number)
    {
        switch (number)
        {
            case 1:
                this.type = this.f1;
                break;
            case 2:
                this.type = this.f2;
                break;
            default:
                this.type = this.f1;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "PassangerCar{" +
                "length=" + length +
                ", typeofregion='" + typeofregion + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void Song()
    {
        System.out.println("Звук Пассажирского транспорта");
    }
}

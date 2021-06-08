public class FreightCar extends Car implements TypeOfTransport
{
    private int carrying;
    private String typeofcargo;
    private String typeofbody;
    private String type;

    public FreightCar(int speed, int tank, String color, int mileage, String firm, int number, int weight, int kolofwheel, int kolofdoor, String typeofdrive, String typeofmove, int carrying, String typeofcargo, String typeofbody, int num ) {
        super(speed, tank, color, mileage, firm, number, weight, kolofwheel, kolofdoor, typeofdrive, typeofmove);
        this.carrying = carrying;
        this.typeofcargo = typeofcargo;
        this.typeofbody = typeofbody;
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
                "FreightCar{" +
                "carrying=" + carrying +
                ", typeofcargo='" + typeofcargo + '\'' +
                ", typeofbody='" + typeofbody + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void Song()
    {
        System.out.println("Звук грузового автомобиля");
    }
}

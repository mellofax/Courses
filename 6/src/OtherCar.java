public class OtherCar extends Car implements TypeOfTransport
{
    private String type;
    private String organization;

    public OtherCar(int speed, int tank, String color, int mileage, String firm, int number, int weight, int kolofwheel, int kolofdoor, String typeofdrive, String typeofmove, String organization) {
        super(speed, tank, color, mileage, firm, number, weight, kolofwheel, kolofdoor, typeofdrive, typeofmove);
        this.type = f3;
        this.organization = organization;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "OtherCar{" +
                "type='" + type + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }

    @Override
    public void Song() {
        System.out.println("Звук особого автомобиля");
    }
}

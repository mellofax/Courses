public class LightCar extends Car
{
    private String valueofcylinders;
    private String typeofbody;

    public LightCar(int speed, int tank, String color, int mileage, String firm, int number, int weight, int kolofwheel, int kolofdoor, String typeofdrive, String typeofmove, String valueofcylinders, String typeofbody) {
        super(speed, tank, color, mileage, firm, number, weight, kolofwheel, kolofdoor, typeofdrive, typeofmove);
        this.valueofcylinders = valueofcylinders;
        this.typeofbody = typeofbody;
    }

    @Override
    public String toString() {
        return  super.toString() + " " +
                "LightCar{" +
                "valueofcylinders='" + valueofcylinders + '\'' +
                ", typeofbody='" + typeofbody + '\'' +
                '}';
    }

    @Override
    public void Song()
    {
        System.out.println("Звук легкого автомобиля");
    }
}

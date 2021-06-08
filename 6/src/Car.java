public abstract class Car extends Transport
{
private int kolofwheel;
private int kolofdoor;
private String typeofdrive;
private String typeofmove;

    public Car(int speed, int tank, String color, int mileage, String firm, int number, int weight, int kolofwheel, int kolofdoor, String typeofdrive, String typeofmove)
    {
        super(speed, tank, color, mileage, firm, number, weight);
        this.kolofdoor = kolofdoor;
        this.kolofwheel = kolofwheel;
        this.typeofdrive = typeofdrive;
        this.typeofmove = typeofmove;
    }

    @Override
    public String toString()
    {
        return super.toString() + " " +
                "Car{" +
                "kolofwheel=" + kolofwheel +
                ", kolofdoor=" + kolofdoor +
                ", typeofdrive='" + typeofdrive + '\'' +
                ", typeofmove='" + typeofmove + '\'' +
                '}';
    }
}

public class Plane extends Transport
{
    private int kolofwings;
    private int kolofengeen;
    private int maxheight;

    public Plane(int speed, int tank, String color, int mileage, String firm, int number, int weight, int kolofwings, int kolofengeen, int maxheight)
    {
        super(speed, tank, color, mileage, firm, number, weight);
        this.kolofengeen = kolofengeen;
        this.kolofwings = kolofwings;
        this.maxheight = maxheight;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "Plane{" +
                "kolofwings=" + kolofwings +
                ", kolofengeen=" + kolofengeen +
                ", maxheight=" + maxheight +
                '}';
    }
}

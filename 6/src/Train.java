public class Train extends Transport
{
    private int kolwag;

    public Train(int speed, int tank, String color, int mileage, String firm, int number, int weight, int kolwag) {
        super(speed, tank, color, mileage, firm, number, weight);
        this.kolwag = kolwag;
    }

    @Override
    public String toString() {
        return  super.toString() + " " +
                "Train{" +
                "kolwag=" + kolwag +
                '}';
    }
}

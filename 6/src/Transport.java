public abstract class Transport
{
    private int speed;
    private int tank;
    private String color;
    private int mileage;
    private String firm;
    private int number;
    private int weight;

    public Transport(int speed, int tank, String color, int mileage, String firm, int number, int weight)
    {
        this.speed = speed;
        this.tank = tank;
        this.color = color;
        this.mileage = mileage;
        this.firm = firm;
        this.number = number;
        this.weight = weight;
    }

    public void Song()
    {
        System.out.println("Звук по умолчанию");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "speed=" + speed +
                ", tank=" + tank +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", firm='" + firm + '\'' +
                ", number=" + number +
                ", weight=" + weight +
                '}';
    }
}

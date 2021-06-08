public class FreightTrain extends Train implements TypeOfTransport
{
    private String type;
    private int maxweight;

    public FreightTrain(int speed, int tank, String color, int mileage, String firm, int number, int weight, int kolwag, int maxweight, int num) {
        super(speed, tank, color, mileage, firm, number, weight, kolwag);
        this.maxweight = maxweight;
        setType(num);
    }


    private void setType(int number)
    {
        switch(number)
        {
            case 1:
                this.type = this.f1;
                break;
            case 2:
                this.type = this.f2;
            default:
                this.type = this.f1;
                break;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "FreightTrain{" +
                "type='" + type + '\'' +
                ", maxweight=" + maxweight +
                '}';
    }

    @Override
    public void Song() {
        System.out.println("Звук грузового поезда");
    }
}

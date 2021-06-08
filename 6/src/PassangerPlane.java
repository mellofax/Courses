public class PassangerPlane extends Plane
{
    private int kolofpassengers;
    private int weightofbaggage;

    public PassangerPlane(int speed, int tank, String color, int mileage, String firm, int number, int weight, int kolofwings, int kolofengeen, int maxheight, int kolofpassengers, int weightofbaggage) {
        super(speed, tank, color, mileage, firm, number, weight, kolofwings, kolofengeen, maxheight);
        this.kolofpassengers = kolofpassengers;
        this. weightofbaggage = weightofbaggage;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "PassangerPlane{" +
                "kolofpassengers=" + kolofpassengers +
                ", weightofbaggage=" + weightofbaggage +
                '}';
    }

    @Override
    public void Song() {
        System.out.println("Звук Пассажирского самолета");
    }
}

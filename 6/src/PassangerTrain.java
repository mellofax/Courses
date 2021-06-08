public class PassangerTrain extends Train
{
    private int kolofpassenger;
    private int weightofbaggage;

    public PassangerTrain(int speed, int tank, String color, int mileage, String firm, int number, int weight, int kolwag, int kolofpassenger, int weightofbaggage) {
        super(speed, tank, color, mileage, firm, number, weight, kolwag);
        this.kolofpassenger = kolofpassenger;
        this.weightofbaggage = weightofbaggage;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "PassangerTrain{" +
                "kolofpassenger=" + kolofpassenger +
                ", weightofbaggage=" + weightofbaggage +
                '}';
    }

    @Override
    public void Song()
    {
        System.out.println("Звук пассажирского поезда");
    }
}

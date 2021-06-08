public class Fighter extends Plane implements TypeOfTransport
{
    private String type;
    private int maxspeed;
    private int kolofguns;

    public Fighter(int speed, int tank, String color, int mileage, String firm, int number, int weight, int kolofwings, int kolofengeen, int maxheight, int maxspeed, int kolofguns) {
        super(speed, tank, color, mileage, firm, number, weight, kolofwings, kolofengeen, maxheight);
        this.type = f2;
        this.kolofguns = kolofguns;
        this.maxspeed = maxspeed;
    }

    @Override
    public void Song() {
        System.out.println("Звук военного самолета");
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "Fighter{" +
                "type='" + type + '\'' +
                ", maxspeed=" + maxspeed +
                ", kolofguns=" + kolofguns +
                '}';
    }
}

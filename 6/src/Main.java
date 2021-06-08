public class Main
{
    public static void main(String[] args)
    {
        ////передаваемые параметры////
        //1 - скорость, 2 - запас топлива, 3 - цвет, 4 - сколько проехал, 5 - фирма, 6 - сер. номер
        //7 - вес
        ////Если автомобиль////
        //
        Transport car1 = new FreightCar(83, 54, "Red", 53434, "Tesla", 4325, 4, 4, 2, "Автоматика", "Колеса", 56, "Что-то", "Матерое", 2);
        System.out.println(car1.toString());
        car1.Song();
    }
}

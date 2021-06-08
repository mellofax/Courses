public class Main {

    public static void main(String[] args)
    {
        triangle f = new triangle();
        int triangle[][] = new int[5][5];
        int SecondTriangle[][] = new int[5][5];
        //вывод треугольника
        triangle = f.first(triangle);
        f.PRINT(triangle);
        //обратный треугольник
        SecondTriangle = f.second(SecondTriangle);
        f.PRINT(SecondTriangle);
    }
}

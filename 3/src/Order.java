public class Order
{
public int[] orderofnumbers(int arr[])
{
    int id = 0;
    int Testmas[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        int a, b;
        if (i == arr.length - 1) {
            a = arr[i];
            b = arr[i];
        } else {
            a = arr[i];
            b = arr[i + 1];
        }
        if (a == b - 1)
        {
            Testmas[id] = arr[i];
            id+=1;
        } else if (arr[i] == arr[i - 1] + 1)
        {
            Testmas[id] = arr[i];
            id+=1;
        }
    }
    int mas[] = new int[id];
    for (int i = 0; i < mas.length; i++)
    {
        mas[i] = Testmas[i];
    }
    return mas;
}
}

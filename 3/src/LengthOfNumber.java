public class LengthOfNumber
{
    public int[] Lengh(int arr[])
    {
        int max = arr[0];
        int min = arr[0];
        int mas[] = new int[2];
        for (int i = 0; i < arr.length; i++)
        {
            if (-(arr[i]) > -max)
            {
                max = arr[i];
            } else if (Math.abs(arr[i]) < Math.abs(min))
            {
                min = arr[i];
            }
        }
        mas[0] = max;
        mas[1] = min;
        return mas;
    }
}

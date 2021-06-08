public class MinAndMax {
    public int[] minmax(int arr[])
    {
        int max = arr[0];
        int min = arr[0];
        int mas[] = new int[2];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            } else if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        mas[0] = max;
        mas[1] = min;
        return mas;
    }
}

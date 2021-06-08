public class EvenAndOdd {
    public int[][] evenodd(int arr[])
    {
        int[][] Testmas = new int[arr.length][arr.length];
        int k = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
            {
                Testmas[k][0] = arr[i];
                k+=1;
            }
            else
            {
                Testmas[0][b] = arr[i];
                b+=1;
            }
        }
        int mas[][] = new int[k][b];
        for (int i = 0; i < k; i++)
        {
            mas[i][0] = Testmas[i][0];
        }
        for (int i = 0; i < b; i++)
        {
            mas[0][i] = Testmas[0][i];
        }
        return mas;
    }
}

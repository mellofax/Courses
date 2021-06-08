public class triangle
{
    public int[][] first(int arr[][])
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if(i == j || i > j)
                    arr[i][j] = 1;
            }
        }
        return arr;
    }
    public int[][] second(int arr[][])
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if(i == j || i < j)
                    arr[i][j] = 1;
            }
        }
        return arr;
    }
    public void PRINT(int arr[][])
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if(arr[i][j] == 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

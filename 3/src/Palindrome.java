public class Palindrome
{
    public int[] palindr(int arr[])
    {
        int id = 0;
        int Testmas[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
           int t = arr[i];
           int k = 0;
           if(t < 0)
           {
               t = -arr[i];
           }
           if(t > 9) {
               while (t > 0) {
                   k += t % 10;
                   t /= 10;
                   k *= 10;
               }
               if (Math.abs(arr[i]) == k / 10)
               {
                   Testmas[id] += arr[i];
                   id+=1;
               }
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

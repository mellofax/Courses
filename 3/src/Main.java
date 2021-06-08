public class Main {

    public static void main(String[] args)
    {
        int[] arr = new int[]{32,22,19,-990,72,-3,-45,44,91};
        int[] arr1 = new int[]{1, 2, 3, 0, 12, 13};
        int[] arr2 = new int[]{32, 11, 121, -990, -54, -3, -45, 911, 21};

        MinAndMax first = new MinAndMax();
        EvenAndOdd second = new EvenAndOdd();
        LengthOfNumber third = new LengthOfNumber();
        Order four = new Order();
        Palindrome five = new Palindrome();

        int maxmin[] = first.minmax(arr);
        int mas[][] = second.evenodd(arr);
        int length[] = third.Lengh(arr);
        int order[] = four.orderofnumbers(arr1);
        int palindr[] = five.palindr(arr2);
    }
}

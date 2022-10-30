package BitManipulation;

//A bit flip of a number x is choosing a bit in the binary representation of x and flipping it from either 0 to 1 or 1 to 0.
//
//        For example, for x = 7, the binary representation is 111 and we may choose any bit (including any leading zeros not shown) and flip it. We can flip the first bit from the right to get 110, flip the second bit from the right to get 101, flip the fifth bit from the right (a leading zero) to get 10111, etc.
//        Given two integers start and goal, return the minimum number of bit flips to convert start to goal.
//
//
//
//        Example 1:
//
//        Input: start = 10, goal = 7
//        Output: 3
//        Explanation: The binary representation of 10 and 7 are 1010 and 0111 respectively. We can convert 10 to 7 in 3 steps:
//        - Flip the first bit from the right: 1010 -> 1011.
//        - Flip the third bit from the right: 1011 -> 1111.
//        - Flip the fourth bit from the right: 1111 -> 0111.
//        It can be shown we cannot convert 10 to 7 in less than 3 steps. Hence, we return 3.

public class MinimumBitFlipsToConvertNumber
{
    public static void main(String[] args)
    {
        int start = 3;
        int goal = 4;
        System.out.println(minBitFlips(start, goal));
    }
    public static int minBitFlips(int a, int b)
    {
        int temp = (a^b);
        int count = 0;
        int mask = (-temp&temp);
        while(temp != 0)
        {
            temp = temp-mask;
            mask = (-temp&temp);
            count++;
        }
        return count;
    }
}

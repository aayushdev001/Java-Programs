package BitManipulation;

import java.util.Scanner;

public class CountSetBits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(hammingWeight(n));
        System.out.println(setBits(n));
    }
    public static int hammingWeight(int n)
    {
        int count = 0;

        for(int i=0; i<32; i++)
        {
            int mask = (1<<i);
            if((n & mask) > 0) count++;
        }
        return count;
    }
    public static int setBits(int n)
    {
        int count = 0;
        while(n != 0)
        {
            n = n&(n-1);
            count++;
        }
        return count;
    }
}

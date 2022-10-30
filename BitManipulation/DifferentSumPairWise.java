package BitManipulation;

import java.util.Scanner;

class DifferentSumPairWise
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<a.length; i++) a[i] = sc.nextInt();
        System.out.println(sum(a));
    }
    public static long sum(int[] a)
    {
        long count = 0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length; j++)
            {
                count += countDifferentBits(a[i]^a[j]);
            }
        }
        return count;
    }
    public static int countDifferentBits(int n)
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

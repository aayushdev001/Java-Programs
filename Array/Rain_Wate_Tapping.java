package Array;

import java.util.Scanner;

public class Rain_Wate_Tapping
{
    public static long maxRight(long[] a, int i )
    {
        long max=Integer.MIN_VALUE;
        for(int j=i+1;j<a.length;j++)
        {
            if(a[j]>max)
            {
                max=a[j];
            }
        }
        return max;
    }
    public static long maxLeft(long[] a, int i )
    {
        long max=Integer.MIN_VALUE;
        for(int j=i-1;j>=0;j--)
        {
            if(a[j]>max)
            {
                max=a[j];
            }
        }
        //System.out.println(max);
        return max;
    }
    public static void waterTapped(long[] a)
    {
        long res=0;
        for(int i=0;i<a.length;i++)
        {
            long t=Long.min(maxLeft(a,i),maxRight(a,i))-a[i];
            if(t>=0)
            {
                res=res+t;
            }

        }
        System.out.println(res);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int j=0;j<a.length;j++)
            {
                a[j]= sc.nextLong();
            }
            waterTapped(a);
        }
    }
}

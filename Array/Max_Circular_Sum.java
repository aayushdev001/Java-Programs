package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Circular_Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n= sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }
            //System.out.println(maxSum(a));
            System.out.println(maxSum2(a));
        }

    }
    public static int maxSum(int[] a)
    {
        int b[]=new int[2*a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        int j=0;
        for(int i=a.length;i<2*a.length-1;i++)
        {
            b[i] = a[j];
            j++;
        }
        //System.out.println(Arrays.toString(b));
        int meh=0;
        int msf=Integer.MIN_VALUE;
        for (int i=0;i<b.length;i++)
        {
            meh=meh+b[i];
            if(meh<b[i])
                meh=a[i];
            if(meh>msf)
                msf=meh;
        }
        return msf;
        //return 0;
    }
    public static int maxSum2(int[] a)
    {
        int b[]=new int[2*a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        int j=0;
        for(int i=a.length;i<2*a.length-1;i++)
        {
            b[i] = a[j];
            j++;
        }

        int max=Integer.MIN_VALUE;
        for(j=0;j<a.length;j++)
        {
            int sum=0;
            for (int i=j;i<j+a.length;i++)
            {
                sum += b[i];
                if(sum > max)
                {
                    max = sum;
                }
                if(sum < 0)
                {
                    sum = 0;
                }
            }
        }
        return max;
    }
}

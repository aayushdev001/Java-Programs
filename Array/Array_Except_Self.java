package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Except_Self
{
    public static long[] productsExceptSelf(long[] a)
    {
        long ans[]=new long[a.length];
        for (int i=0;i<a.length;i++)
        {
            long p=1;
            for(int j=0;j<a.length;j++)
            {
                if(i!=j)
                {
                    p=p*a[j];
                }

            }
            ans[i]=p;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]= sc.nextLong();
        }
        productsExceptSelf(a);

        //System.out.println(Arrays.toString(productsExceptSelf(a)));
    }
}

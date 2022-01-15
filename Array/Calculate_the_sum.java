package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Calculate_the_sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextLong();
        }

        long b[]=new long[a.length];
        int t=sc.nextInt();

        for(int j=0;j<t;j++)
        {
            int x=sc.nextInt();
            for(int i=0;i<a.length;i++)
            {
                if((i-x)<0)
                {
                    b[i]=a[i]+a[i-x+a.length];
                }
                else
                {
                    b[i]=a[i]+a[i-x];
                }
            }
            a=b;
        }
        long sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+b[i];
        }

        //System.out.println(Arrays.toString(b));
        System.out.println(sum);
        System.out.println(sum%(Math.pow(10,9)+7));
    }
}

package Array;

import java.util.Scanner;

public class DivisileSubarrays
{
    public static long sum(long[] a,int i, int j)
    {
        long sum=0;
        for(int k=i;k<=j;k++)
        {
            sum=sum+a[k];
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int j=0;j<a.length;j++)
            {
                a[j]= sc.nextLong();
            }
            int count=0;
            for(int j=0;j<a.length;j++)
            {
                for(int k=j;k<a.length;k++)
                {
                    long sum=0;
                    for(int l=j;l<=k;l++)
                    {

                        //System.out.print(a[l]+" ");
                        sum=sum+a[l];

                    }
                    if(sum%n==0)
                    {
                        count++;
                    }
                    //System.out.print("sum="+sum);
                    //System.out.println();

                }
            }
            System.out.println(count);

        }
    }
}

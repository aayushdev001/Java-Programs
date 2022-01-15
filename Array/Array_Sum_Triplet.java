package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sum_Triplet
{

    public static void findTriplets(long a[], long t)
    {
        for(int i=0;i<a.length-2;i++)
        {
            int j=i+1;
            int k=a.length-1;
            while(j<k)
            {
                if(a[i]+a[j]+a[k]>t)
                {
                    k--;
                }
                else if(a[i]+a[j]+a[k]<t)
                {
                    j++;
                }
                else
                {
                    System.out.println(a[i]+", "+a[j]+" and "+a[k]);
                    j++;
                    k--;
                }
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        long a[]=new long[n];
        long arr[]=new long[3];

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextLong();
        }
        Arrays.sort(a);
        long t=sc.nextLong();
        findTriplets(a,t);
    }
}

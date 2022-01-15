package Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Painters_Partition
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int n= sc.nextInt();
        long a[]=new long[n];
        for(int j=0;j<a.length;j++)
        {
            a[j]=sc.nextInt();
        }
        //Arrays.sort(a);

    }
    public static void minTime(long a[],int p)
    {
        long low= largest(a);
        //System.out.println(low);
        long high=sum(a);
        //System.out.println(high);
        long tim=high;
        while (low<=high)
        {
            long mid=(low+high)/2;
            if(isPossible(a,mid,p))
            {
                tim=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        if(p==1)
            System.out.println(sum(a));
        else if(p>=a.length)
            System.out.println(largest(a));
        else
            System.out.println(tim-1);
    }
    public static long largest(long[] arr)
    {
        int i;

        // Initialize maximum element
        long max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }
    public static long sum(long[] a)
    {
        long sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
    public static boolean isPossible(long[] a, long mid, int p)
    {
        long temp=0;
        int count=1;
        for (int i=0;i<a.length;i++)
        {
            /*if(a[i]>mid)
            {//return false;}*/
            if(temp+a[i]>=mid)
            {
                count++;
                temp=a[i];
            }
            else
            {
                temp=temp+a[i];
            }
        }
        //System.out.println("count= "+count);
        if(count>p)
        {return false;}
        else
        {
            return true;
        }
    }
}

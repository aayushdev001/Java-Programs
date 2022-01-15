package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        long x=sc.nextLong();
        System.out.println(binSrch(a,x));
    }
    public static int binSrch(long[] a, long x)
    {
        int low=0;
        int high=a.length-1;
        while(low<=high)
        {
            int mid=(int)(low+high)/2;
            if(a[mid]==x)
                return mid;
            else if(a[mid]>x)
            high=mid-1;
            else
                low =mid+1;
        }
        return -1;
    }
}

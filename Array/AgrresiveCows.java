package Array;

import java.util.Arrays;
import java.util.Scanner;

public class AgrresiveCows
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int c= sc.nextInt();
        int a[]=new int[N];
        for(int i=0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        int high=a[a.length-1]-a[0];
        int low=a[0];
        int res=0;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if(canPlaceCows(a,mid,c))
            {
                res=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        System.out.println(res);
    }
    public static boolean canPlaceCows(int[] a, int mid, int c)
    {
        int intial=a[0];
        int count=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]-intial>=mid)
            {
                count++;
                intial=a[i];
            }
            if(count==c)
            {return true;}
        }
        return false;
    }
}

package Array;

import java.rmi.dgc.VMID;
import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Paratha
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int paratha=sc.nextInt();
        int n=sc.nextInt();
        int[] a =new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(minTime(a,paratha));
    }
    public static int minTime(int[] a, int p)
    {
        //int low=(p*(p+1)*a[0])/2;
        int low=0;
        int high=(p*(p+1)*a[a.length-1])/2;
        //System.out.println(low);
        //System.out.println(high);

        int tim=0;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if(isPossible(a, mid, p))
            {
                high=mid-1;
                tim=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return tim;
        //return 0;
    }
    public static boolean isPossible(int[] a, int mid, int p)
    {
        int count=0;

        for (int i=0;i<a.length;i++)
        {
            int sum=0;
            for(int j=1;sum<mid;j++)
            {
                if(sum+a[i]*j>mid)
                    break;
                else
                {
                    sum=sum+a[i]*j;
                    count++;
                }
            }
            //System.out.println("cont= "+count);
            //System.out.println("sum= "+sum);
            if (count>=p)
                return true;

        }


        //else
        return false;
    }
}

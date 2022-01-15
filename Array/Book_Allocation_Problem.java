package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Book_Allocation_Problem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int stu=sc.nextInt();
            for(int j=0;j<a.length;j++)
            {
                a[j]=sc.nextInt();
            }
            Arrays.sort(a);
            //System.out.println(Arrays.toString(a));
            int low=a[0];
            int high=sum(a);
            //System.out.println("high"+high);
            int res=0;
            while(low<high)
            {
                int mid=(low+high)/2;
                if(allocationIsPossible(a,mid,stu))
                {
                    res=mid;
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }

            }
            System.out.println(res);

        }
    }
    public static int sum(int[] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
    public static boolean allocationIsPossible(int[] a, int mid, int k)
    {
        int stu=1;
        int pages=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>mid)
            {return false;}
            if(pages+a[i]>mid)
            {
                stu++;
                pages=a[i];
            }
            else
            {
                pages=pages+a[i];
            }
        }
        if(stu>k)
        {return false;}
        else
        {return true;}
    }
}

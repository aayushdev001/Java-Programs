package Backtracking;
import java.util.*;

public class Quick_Sort
{
    public static void main(String[] args)
    {
        int arr[]={4,6,7,2,8,3,5};
        //partition(arr,0,arr.length-1);
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] a, int si, int ei)
    {
        if(si>ei)
        {return;}
        else
        {
            int t=partition(a,si,ei);
            sort(a,si,t-1);
            sort(a,t+1,ei);
        }
    }
    public static int partition(int[] a, int si, int ei)
    {
        int pivot = a[ei];
        int j=si;
        for (int i=si;i<ei;i++)
        {
            if(a[i]<pivot)
            {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                j++;
            }
        }
        int t=a[ei];
        a[ei]=a[j];
        a[j]=t;
        return j;

    }
}

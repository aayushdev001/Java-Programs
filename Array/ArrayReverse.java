package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse
{
    public static void reverse(int[] a)
    {
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
            swap(a,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int[] a, int i, int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static boolean isMirror (long[] a)
    {
        long b[]=new long[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[a.length-1-i];
        }
        //reverse(a);
        System.out.println(Arrays.toString(b));
        boolean flag=true;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
            {
                flag =false;
                break;
            }
        }
        return flag;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        long min=Integer.MAX_VALUE;
       // System.out.println(Arrays.toString(a));
        System.out.println(isMirror(a));
    }
}

package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Search
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,4,7,8,9};
        //System.out.println(Arrays.toString(search(a,0,4,0)));
        ArrayList<Integer> al=new ArrayList<>();
        //search2(a,0,4,al);
        //printInc(a,0);
        printDec(a,a.length-1);
        //System.out.println(al);
       //System.out.println(subS("abx"));
        //System.out.println(subS2("abx"));
    }
    public static void printInc(int a[],int i)
    {
        if(i==a.length)
        {
            return;
        }
        else
        {
            System.out.println(a[i]);
            printInc(a,i+1);
        }
    }
    public static void printDec(int a[],int i)
    {
        if(i<0)
        {
            return;
        }
        else
        {
            System.out.println(a[i]);
            printDec(a,i-1);
        }
    }
    public static int[] search(int a[], int i,int x,int count)
    {
        if(i==a.length)
        {
            return new int[count];
        }
        else
        {
            if(a[i]==x)
            {
                count++;
            }
            int[] ans= search(a,i+1,x,count);
            if(a[i]==x)
            {
                ans[count-1]=i;
            }
            return ans;
        }

    }
    public static void search2(int[] a, int i, int x, ArrayList<Integer> al)
    {
        if(i==a.length)
        {
            return;
        }
        else
        {
            if (a[i]==x)
            {
                al.add(i);
            }
            search2(a,i+1,x,al);
        }
    }

}

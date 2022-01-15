package Array;

import java.util.*;
public class Array_Rotate
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<a[0].length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a[0].length;i++)
        {
            //reverse(a[i]);
        }
        transpose(a);
        swapColumns(a);
        transpose(a);
        swapColumns(a);
        transpose(a);
        swapColumns(a);
        for(int i=0;i<a[0].length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void swapColumns(int[][] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length / 2; j++)
            {
                int temp = a[i][j];
                a[i][j] = a[i][a.length - j - 1];
                a[i][a.length - j - 1] = temp;
            }
        }
    }

    public static void reverse(int a[])
    {
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
    public static void transpose(int[][] a)
    {
        for(int i=0;i<a[0].length;i++)
        {
            for(int j=i;j<a[0].length;j++)
            {
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }
    }
}

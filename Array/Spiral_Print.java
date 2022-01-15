package Array;
import java.util.Arrays;
import java.util.Scanner;


public class Spiral_Print
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int a[][]=new int[m][n];
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        //SpiralPrintCW(a);
        SpiralPrintACW(a);
    }
    public static void SpiralPrintCW(int[][] arr)
    {
        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length-1;
        int maxcol = arr[0].length-1;

        int te = arr.length*arr[0].length;
        int count = 0;
        int[] brr = new int[te];

        while(count < te)
        {
            for(int i = mincol; i <= maxcol && count < te; i++)
            {
                brr[count] = arr[minrow][i];
                System.out.print(arr[minrow][i]+" ");
                count++;
            }
            minrow++;

            for(int i = minrow; i<= maxrow && count < te; i++)
            {
                brr[count] = arr[i][maxcol];
                System.out.print(arr[i][maxcol]+" ");
                count++;
            }
            maxcol--;

            for(int i = maxcol; i >= mincol && count < te; i--)
            {
                brr[count] = arr[maxrow][i];
                System.out.print(arr[maxrow][i]+" ");
                count++;
            }
            maxrow--;

            for(int i = maxrow; i >= minrow && count < te; i--)
            {
                brr[count] = arr[i][mincol];
                System.out.print(arr[i][mincol]+" ");
                count++;
            }
            mincol++;

        }
        System.out.println();
        System.out.println(Arrays.toString(brr));

    }
    public static void SpiralPrintACW(int[][] arr)
    {
        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length-1;
        int maxcol = arr[0].length-1;

        int te = arr.length*arr[0].length;
        int count = 0;
        int[] brr = new int[te];

        while(count < te)
        {
            for(int i = mincol; i <= maxcol && count < te; i++)
            {
                brr[count] = arr[minrow][i];
                System.out.print(arr[i][minrow]+" ");
                count++;
            }
            minrow++;

            for(int i = minrow; i<= maxrow && count < te; i++)
            {
                brr[count] = arr[i][maxcol];
                System.out.print(arr[maxcol][i]+" ");
                count++;
            }
            maxcol--;

            for(int i = maxcol; i >= mincol && count < te; i--)
            {
                brr[count] = arr[maxrow][i];
                System.out.print(arr[i][maxrow]+" ");
                count++;
            }
            maxrow--;

            for(int i = maxrow; i >= minrow && count < te; i--)
            {
                brr[count] = arr[i][mincol];
                System.out.print(arr[mincol][i]+" ");
                count++;
            }
            mincol++;

        }
        System.out.println();
        //System.out.println(Arrays.toString(brr));

    }
}


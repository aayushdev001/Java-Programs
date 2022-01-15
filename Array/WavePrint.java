package Array;

import java.util.Scanner;

public class WavePrint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner((System.in));
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] a=new int[m][n];
        for(int i=0;i< a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        verticalWave(a);
    }
    public static void verticalWave(int[][] a)
    {
        for(int i=0;i<a[0].length;i++)
        {
            if(i%2!=0)
            {
                for(int j=a.length-1;j>=0;j--)
                {
                    System.out.print(a[j][i]+", ");
                }
            }
            else
            {
                for(int j=0;j<a.length;j++)
                {
                    System.out.print(a[j][i]+", ");
                }
            }
        }
        System.out.print("END");
    }
}

package Array;

import java.util.Scanner;

public class Help_Ramu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int c[]=new int[4];
            for(int j=0;j<4;j++)
            {
                c[j]= sc.nextInt();
            }
            int m=sc.nextInt();
            int n= sc.nextInt();
            int[] a=new int[m];
            int[] b=new int[n];
            for(int j=0;j<a.length;j++)
            {
                a[j]= sc.nextInt();
            }
            for(int j=0;j<b.length;j++)
            {
                b[j]= sc.nextInt();
            }
            System.out.println(Integer.min(minRikshaw(a,c)+minCab(b,c),c[3]));
        }
    }
    public static int minRikshaw(int[] a,int[] c)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=Integer.min(a[i]*c[0],c[1]);
        }
        return Integer.min(sum,c[2]);
    }
    public static int minCab(int[] a,int[] c)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=Integer.min(a[i]*c[0],c[1]);
        }
        return Integer.min(sum,c[2]);
    }
}


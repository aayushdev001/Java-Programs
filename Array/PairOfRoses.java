package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses
{
    public static void roses(int[] a, int t)
    {
        int min=Integer.MAX_VALUE;
        int b[]=new int[2];
        for(int i=0;i<a.length;i++)
        {

            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==t)
                {
                    //System.out.println(a[i]+", "+a[j]);

                    if(a[j]-a[i]<min)
                    {
                        min=a[j]-a[i];
                        b[0]=a[i];
                        b[1]=a[j];
                    }
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are "+b[0]+" and "+b[1]+".");
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<a.length;j++)
            {
                a[j]=sc.nextInt();
            }
            //System.out.println("array="+Arrays.toString(a));

            Arrays.sort(a);
            //System.out.println("array="+Arrays.toString(a));
            int sum= sc.nextInt();
            roses(a,sum);
        }
    }
}

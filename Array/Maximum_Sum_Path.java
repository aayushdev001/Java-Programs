package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Maximum_Sum_Path
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n= sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[m];
            for(int k=0;k<a.length;k++)
            {
                a[k]= sc.nextInt();
            }
            for(int k=0;k<b.length;k++)
            {
                b[k]= sc.nextInt();
            }
            System.out.println(common(a,b));
        }
    }
    public static int maxSumLeft(int[] a, int k)
    {
        int sum=0;
        for(int i=k;i>=0;i--)
        {
            sum+=a[i];
        }
        return sum;
    }
    public static int maxSumRight(int[] a, int k)
    {
        int sum=0;
        for(int i=k;i<a.length;i++)
        {
            sum+=a[i];
        }
        return sum;
    }
    public static int common(int[] a, int[] b)
    {
        int i;
        int max=Integer.MIN_VALUE;
        for(i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if (a[i]==b[j])
                {
                    //System.out.println(a[i]);
                    int sum1=maxSumLeft(a,i)+maxSumRight(b,j)-a[i];
                    int sum2=maxSumLeft(b,j)+maxSumRight(a,i)-a[i];
                    int temp=Integer.max(sum1,sum2);
                    //System.out.println("sum1= "+sum1+" sum2= "+sum2);
                    //System.out.println("temp= "+Integer.max(sum1,sum2));
                    if(temp>max)
                    {
                        max=Integer.max(sum1,sum2);
                        //System.out.println("max= "+max);
                    }
                }
            }
        }
        return max;
    }
}

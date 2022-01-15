package Array;

import java.util.Scanner;

public class Decreasing_Increasing_Sequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]= sc.nextLong();
        }
        int i;
        boolean flag=true;
        for(i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                break;
            }
        }
        /*while(i<a.length && )
        {
            i++;
        }*/
        for(int k=i;k<a.length-1;k++)
        {
            if(a[k]<a[k+1])
            {
                flag=false;
            }
        }
        if(i==a.length)
            //return true;
            System.out.println(true);
        /*else if(i==0)
            System.out.println();*/
        if(flag)
//            return flag;
            System.out.println(true);
        else
//            return flag;
            System.out.println(false);
    }
}

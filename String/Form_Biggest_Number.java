package String;

import java.util.Arrays;
import java.util.Scanner;

public class Form_Biggest_Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n= sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<a.length;j++)
            {
                a[j]= sc.nextInt();
            }
            for(int j=0;j<a.length-1;j++)
            {
                for(int k=j+1;k<a.length;k++)
                {
                    if(Long.parseLong(String.valueOf(a[k])+String.valueOf(a[j]))>Long.parseLong(String.valueOf(a[j])+String.valueOf(a[k])))
                    {
                        int temp=a[j];
                        a[j]=a[k];
                        a[k]=temp;
                    }
                }
            }
            StringBuilder s=new StringBuilder();
            for(int j=0;j<a.length;j++)
            {
                //s=s+StringBuilder.
            }

            //System.out.println(Arrays.toString(a));
        }
    }
}

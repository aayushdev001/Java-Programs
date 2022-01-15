package Array;

import java.util.Scanner;

public class Alex_Goes_Shopping
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        int q= sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int count=0;
            int A= sc.nextInt();
            int k= sc.nextInt();
            for(int j=0;j<a.length;j++)
            {
                if(A%a[j]==0)
                    count++;
            }
            if(count>=k)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
}

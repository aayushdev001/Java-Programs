package Recursion;

import java.util.Scanner;

public class Piyush_and_Magical_Park
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int k=sc.nextInt();
        int s=sc.nextInt();
        char a[][]=new char[n][m];
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                a[i][j]=sc.next().charAt(0);
            }
        }
        mp(a,0,0,k,s);
    }
    public static void mp(char a[][], int i, int j, int k, int s)
    {
        if (i==a.length)
        {
            if(s>=k)
            {
                System.out.println("Yes");
                System.out.println(s);
            }
            else
                System.out.println("No");
        }
        else if(j==a[0].length)
        {
            mp(a,i+1,0,k,s+1);
        }
        else if(a[i][j]=='.')
        {
            mp(a,i,j+1,k, s-3);
        }
        else if(a[i][j]=='*')
        {
            mp(a,i,j+1,k,s+4);
        }
        else if(a[i][j]=='#')
        {
            mp(a,i+1,0,k,s);
        }
        else
        {
            mp(a,i,j+1,k, s-1);
        }
        System.out.println(s);
    }
}

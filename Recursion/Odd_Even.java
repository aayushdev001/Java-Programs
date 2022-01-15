package Recursion;

import java.util.Scanner;

public class Odd_Even
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nodd(n,n);
        neven(n,1);
    }
    public static void nodd(int n, int i)
    {
        if(i<0)
        {return;}
        else
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
            nodd(n, i - 1);
        }

    }
    public static void neven(int n, int i)
    {
        if(i>n)
        {return;}
        else
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
            neven(n, i + 1);
        }

    }

}


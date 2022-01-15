package Recursion;

import java.util.Scanner;

public class Nth_triangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        nth(n,0,1,0);
    }
    public static void nth(int n, int i, int p, int sum)
    {
        if(i==n)
        {
            System.out.println(sum);
        }
        else
        {
            nth(n,i+1,p+1,sum+p);
        }
    }
}

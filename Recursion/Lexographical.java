package Recursion;

import java.util.Scanner;

public class Lexographical
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print("0 ");
        for(int i=1;i<10;i++)
        {
            lex(i,n);
        }

    }
    public static void lex(int i, int n)
    {
        if(i>n)
        {return;}
        else
        {
            System.out.print(i+" ");
            for(int k=0;k<10;k++)
            {
                lex(i*10+k,n);
            }
        }

    }
}

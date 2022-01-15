package Recursion;

import java.util.Scanner;

public class Duplicate_Character
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        dc(s,"");
    }
    public static void dc(String s, String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
        }
        else if(s.length()==1)
        {
            char c=s.charAt(0);
            dc(s.substring(1),ans+c);
        }
        else
        {
            char c=s.charAt(0);
            if(c==s.charAt(1))
            {
                dc(s.substring(1),ans+c+"*");
               // System.out.println(ans);
            }
            else
            {
                dc(s.substring(1),ans+c);
                //System.out.println(ans);
            }
        }
    }
}

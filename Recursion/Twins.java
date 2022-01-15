package Recursion;

import java.util.Scanner;

public class Twins
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(tw(s,0));
    }
    public static int tw(String s, int count)
    {
        int n=0;
        if(s.length()>2)
        {
            if(s.charAt(0)==s.charAt(2))
            {
                n=count+1;
            }
            return n+tw(s.substring(2),count);
        }
        else
        {
            return count+1;
        }

    }
}

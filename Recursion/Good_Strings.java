package Recursion;

import javax.swing.*;
import java.util.Scanner;

public class Good_Strings
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        gd(s,0,0);
    }
    public static boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
        else
            return false;
    }
    public static void gd(String s, int count, int max)
    {

        if(s.length()==0)
        {   System.out.println(max);
        }
        else
        {
            char c=s.charAt(0);
            if(isVowel(c))
            {
                //System.out.println(c);
                if(count+1>max)
                {
                    gd(s.substring(1),count+1,count+1);
                }
                else
                {
                    gd(s.substring(1),count+1,max);
                }
            }
            else
            gd(s.substring(1),0,max);

        }

    }
}

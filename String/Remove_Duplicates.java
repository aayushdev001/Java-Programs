package String;

import java.util.Scanner;

public class Remove_Duplicates
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        StringBuilder s1=new StringBuilder(s);
        String s2="";
        //System.out.println(s1);
        s2=s2+s.charAt(0);
        for(int i=1;i< s.length();i++)
        {
            int count=0;
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            if(count==0)
            {
                s2=s2+s.charAt(i);
            }
        }
        System.out.println(s2);
    }
}

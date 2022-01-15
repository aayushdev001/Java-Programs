package Recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Subsequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int j=0;j<t;j++)
        {
            String s=sc.next();
            ArrayList<String> al = new ArrayList<>();
            al=subS(s);
            Collections.sort(al);
            for (int i=0;i<al.size();i++)
            {
                System.out.println(al.get(i));
            }
        }

    }
    public static ArrayList<String> subS(String s)
    {
        if(s.length()==0)
        {
            ArrayList<String> b=new ArrayList<>();
            b.add("");
            return b;
        }
        else
        {
            char ch=s.charAt(0);
            ArrayList<String> rr=subS(s.substring(1));
            ArrayList<String> ans=new ArrayList<>();
            for(int i=0;i<rr.size();i++)
            {
                ans.add(rr.get(i));
            }
            for(int i=0;i<rr.size();i++)
            {
                ans.add(ch+rr.get(i));
            }
            return ans;
        }
    }

}

package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mapped_Strings
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        mp(s,"");
        Collections.sort(mp2(s));
        //System.out.println(Collections.sort(mp2(s)));
    }
    public static void mp(String s, String ans)
    {
        if(s.length() == 0)
        {
            System.out.println(ans);
        }
        else
        {
            char ch1=s.charAt(0);
            char n=(char) (ch1-'1'+'A');
            mp(s.substring(1),ans+n);
            if(s.length()>1)
            {
                String ch2=s.substring(0,2);
                int n2= Integer.parseInt(ch2);
                mp(s.substring(2),ans+(char)(n2-1+'A'));
            }
        }

    }
    public static ArrayList<String> mp2(String s)
    {
        if(s.length()==0)
        {
            ArrayList<String> b=new ArrayList<>();
            b.add("");
            return b;
        }
        else
        {
            char ch1=s.charAt(0);
            ArrayList<String> ans=new ArrayList<>();
            ArrayList<String> rr=mp2(s.substring(1));
            char n=(char) (ch1-'1'+'A');
            for(int i=0;i< rr.size();i++)
            {
                ans.add(n+rr.get(i));
            }
            if(s.length()>1)
            {
                String ch2=s.substring(0,2);
                int n2= Integer.parseInt(ch2);
                ArrayList<String> rr2=mp2(s.substring(2));
                for (int i=0;i< rr2.size();i++)
                {
                    ans.add((char)(n2-1+'A')+rr2.get(i));
                }
            }
            return ans;
        }
    }
}

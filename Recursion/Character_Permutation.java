package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Character_Permutation
{
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
        //perm("abc","");
        //System.out.println(perm2("abc"));
        //perm3("abc",al);
        //System.out.println(al);
        trickyPermutation("abc","");

    }
    public static void perm(String s, String ans)
    {
        if (s.length()==0)
        {
            System.out.println(ans);
        }
        else
        {
            char c=s.charAt(0);
            for(int i=0;i<=ans.length();i++)
            {
                String nans=ans.substring(0,i)+c+ans.substring(i);
                perm(s.substring(1),nans);
            }

        }
    }
    public static ArrayList<String> perm2(String s)
    {
        if (s.length()==0)
        {
            return new ArrayList<String>(Arrays.asList(""));
        }
        else
        {
            char c=s.charAt(0);
            ArrayList<String> rr=perm2(s.substring(1));
            ArrayList<String> ans=new ArrayList<>();
            for (int j=0;j< rr.size();j++)
            {
                for(int i=0;i<=rr.get(j).length();i++)
                {
                    ans.add(rr.get(j).substring(0,i)+c+rr.get(j).substring(i));

                }
            }
            return ans;


        }

    }
    public static void perm3(String s, ArrayList<String> al)
    {
        if (s.length() == 0) {
            return;
        } else {
            char c = s.charAt(0);
            ArrayList<String> rr = perm2(s.substring(1));
            //ArrayList<String> ans=new ArrayList<>();
            for (int j = 0; j < rr.size(); j++) {
                for (int i = 0; i <= rr.get(j).length(); i++) {
                    al.add(rr.get(j).substring(0, i) + c + rr.get(j).substring(i));

                }
            }

        }
    }
    public static void trickyPermutation(String s, String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
        }
        else
        {
            if(ans.length()!=0)
                System.out.println(ans);
                for(int i=0;i<s.length();i++)
                {
                    String na=s.substring(0,i)+s.substring(i+1);
                    trickyPermutation(na,ans+s.charAt(i));
                }
        }
    }
}


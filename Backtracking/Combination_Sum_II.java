package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Combination_Sum_II
{
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> bigans=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> ans=new ArrayList<>();
        int c[]={10,1,1,2,7,6,1,5};
        Arrays.sort(c);
        sum(bigans,ans,c,8,0,0);
        System.out.println(bigans);
    }
    public static void sum(ArrayList<ArrayList<Integer>> bigans, ArrayList<Integer> ans, int[] c, int t, int s, int lp)
    {
        if(s==t)
        {
            bigans.add(new ArrayList<>(ans));
        }
        else if (s>t)
        {}
        else
        {
            for (int i=lp;i<c.length;i++)
            {
                if(i==lp||c[i]!=c[i-1])
                {
                    ans.add(c[i]);
                    sum(bigans,ans,c,t,s+c[i],i+1);
                    ans.remove(ans.size()-1);
                }

            }
        }
    }
}

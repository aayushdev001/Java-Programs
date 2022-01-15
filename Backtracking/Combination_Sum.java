package Backtracking;

import java.util.ArrayList;

public class Combination_Sum
{
    public static void main(String[] args)
    {
        int c[]={2,3,5};
        ArrayList<ArrayList<Integer>> bigans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a = new ArrayList<Integer>();
        targetSum(a,bigans,c,8,0,0);
        System.out.println(bigans);
    }
    public static void targetSum(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> bigans, int[] c, int t, int s, int lp)
    {
        if(s==t)
        {
            bigans.add(new ArrayList<Integer>(a));
        }
        else if(s>t)
        {return;}
        else
        {
            for (int i=lp;i<c.length;i++)
            {
                if(c[i]!=c[i-1])
                {}
                a.add(c[i]);
                targetSum(a, bigans,c,t,s+c[i],i);
                a.remove(a.size()-1);
            }
        }
    }
}

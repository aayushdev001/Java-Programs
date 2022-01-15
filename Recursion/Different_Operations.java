package Recursion;

import java.util.ArrayList;

public class Different_Operations
{
    public static void main(String[] args)
    {
        //ArrayList<Integer> al=new ArrayList<>();
        diffOp("2*3-4*5");
        System.out.println(diffOp("2*3-4*5"));
    }
    public static boolean isOperator(char c)
    {
        if(c=='+'||c=='-'||c=='*')
            return true;
        else
            return false;
    }
    public static int operation(int a, int b, char c)
    {
        if(c=='+')
            return a+b;
        else if(c=='*')
            return a*b;
        else
            return a-b;
    }
    public static ArrayList<Integer> diffOp(String s)
    {
        if (s.indexOf('+') == -1 && s.indexOf('-') == -1 && s.indexOf('*') == -1)
        {
            ArrayList<Integer> b=new ArrayList<>();
            b.add(Integer.parseInt(s));
            return b;
        }
        else
        {
            ArrayList<Integer> ans=new ArrayList<>();
            for (int i=0;i<s.length();i++)
            {
                if(isOperator(s.charAt(i)))
                {
                    ArrayList<Integer> left=diffOp(s.substring(0,i));
                    ArrayList<Integer> right=diffOp(s.substring(i+1));

                    for (int j=0;j< left.size();j++)
                    {
                        for (int k=0;k<right.size();k++)
                        {
                            ans.add(operation(left.get(j),right.get(k),s.charAt(i)));
                        }
                    }
                }
            }
            return ans;
        }
    }
}

package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Brackets_Balanced
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        ArrayList<Character> al=new ArrayList<>();
        System.out.println(isBalanced(s, al, true));
    }
    public static boolean isBracketOpen(char c)
    {
        if(c=='['|| c=='{' || c=='(')
        {
            return true;
        }
        else
            return false;
    }
    public static boolean isBracketClose(char c)
    {
        if(c==']'|| c=='}' || c==')')
        {
            return true;
        }
        else
            return false;
    }
    public static Character reverseBracket(char c)
    {
        if(c=='[')
            return ']';
        else if(c=='{')
            return '}';
        else if (c=='(')
            return ')';
        return null;
    }
    public static boolean isBalanced(String s, ArrayList<Character> al, boolean a)
    {
        if (s.length()==0)
        {
            return a;
        }
        else
        {
            for (int i=0;i<s.length();i++)
            {
                if(isBracketOpen(s.charAt(i)))
                {
                    al.add(s.charAt(i));
                    //System.out.println(al);
                    //isBalanced(s.substring(1),al,a);

                }
                else if(isBracketClose(s.charAt(i)))
                {
                    if(s.charAt(i)==reverseBracket(al.get(al.size()-1)))
                    {
                        al.remove(al.size()-1);
                        //isBalanced(s.substring(1),al,a);

                    }
                    else
                        return false;
                }
            }
            return true;
        }
    }
}

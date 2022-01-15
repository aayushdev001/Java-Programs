package Stacks_and_queues;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isBalanced(s));
    }
    public static boolean isOpen(char c)
    {
        return c=='(' || c=='{' || c=='[';
    }
    public static boolean isClosed(char c)
    {
        return c==')' || c=='}' || c==']';
    }
    public static char opposite(char c)
    {
        if(c==')')
            return '(';
        else if (c=='}')
            return '}';
        else if (c==']')
            return ']';

        return ' ';
    }
    public static boolean isBalanced(String s)
    {
        Stack<Character> st=new Stack<>();
        for (int i=0;i<s.length();i++)
        {
            if (isOpen(s.charAt(i)))
                st.push(s.charAt(i));
            else if (isClosed(s.charAt(i)))
            {
                if (opposite(s.charAt(i))==st.peek())
                    st.pop();
                else
                    return false;
            }
            else {}
        }
        return true;
    }

}

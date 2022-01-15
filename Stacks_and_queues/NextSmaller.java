package Stacks_and_queues;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextSmaller
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int j=0;j<a.length;j++)
            {
                a[j]= sc.nextInt();
            }
            //int a[]={9, 6, 2, 1, 4, 0, 2, 0};
            smaller(a);
        }

    }
    public static void smaller(int[] a)
    {
        int ans[]=new int[a.length];
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<a.length;i++)
        {
            while (!st.isEmpty() && a[st.peek()]>a[i])
            {
                ans[st.pop()]=a[i];
            }
            st.push(i);
        }
        while (!st.isEmpty())
        {
            ans[st.pop()]=-1;
        }
        System.out.println(Arrays.toString(ans));

    }
}

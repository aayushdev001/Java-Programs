package Stacks_and_queues;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int ans[] = ss(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.print("END");
    }
    public static int[] ss(int[] arr)
    {
        int ans[]=new int[arr.length];
        Stack<Integer> st=new Stack();
        for (int i=0;i< arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]>=arr[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i]=i+1;
            }
            else
            {
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        return ans;

    }
}

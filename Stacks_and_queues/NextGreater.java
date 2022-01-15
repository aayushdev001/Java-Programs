package Stacks_and_queues;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater
{
    public static void main(String[] args) {
        int[] arr={120,20,100,70,60,65,75,80,70,110,60};
        int ans[]=nextG(arr);
        for (int i=0;i< ans.length;i++)
            System.out.println(arr[i]+", "+ans[i]);

    }
    public static int[] nextG( int[] arr)
    {
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for (int i=0;i< arr.length;i++)
        {
            while(!st.isEmpty()&&arr[i]<=arr[st.peek()])
            {
                int j=st.pop();
                ans[j]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            int j=st.pop();
            ans[j]=-1;
        }
        return ans;

    }
}

package Stacks_and_queues;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class NextGreater_II
{
    public static void main(String[] args) {
        int[] arr={120,20,100,70,60,65,75,80,70,110,60};
        //int[] arr={99,97,98};
        int ans[]=nextG(arr);
        for (int i=0;i< ans.length;i++)
            System.out.println(arr[i]+", "+ans[i]);

    }
    public static int[] nextG( int[] arr)
    {
        int[] ans=new int[arr.length];
        //System.out.println(Arrays.toString(ans));
        Stack<Integer> st=new Stack<>();
        for (int i=0;i <=(2*arr.length);i++)
        {
            while(!st.isEmpty() && arr[i% arr.length]>arr[st.peek()])
            {
                int j=st.pop();
                ans[j]=arr[i% arr.length];
            }
            st.push(i% arr.length);
            System.out.println(Arrays.toString(ans));
//


        }
        while(!st.isEmpty())
        {
            int j=st.pop();
            ans[j]=-1;
        }
        return ans;

    }
}
